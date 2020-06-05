package com.kursjava.gamedev;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.GridPoint2;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class SimpleJigsawPuzzleGame extends ApplicationAdapter {
  public static final int WINDOW_WIDTH = 800;
  public static final int WINDOW_HEIGHT = 450;

  private static final int PUZZLE_PIECE_WIDTH = 100;
  private static final int PUZZLE_PIECE_HEIGHT = 100;

  private Texture puzzleImg;
  private Texture puzzleOutlineImg;
  private SpriteBatch batch;
  private int puzzleOriginX;
  private int puzzleOriginY;

  private List<PuzzlePiece> puzzlePiecesLeft;
  private List<PuzzlePiece> puzzlePiecesInPlace;
  private PuzzlePiece selectedPiece;
  private GridPoint2 lastMousePosition = new GridPoint2();

  @Override
  public void create () {
    puzzleImg = new Texture("kitty.png");
    puzzleOriginX = WINDOW_WIDTH / 2 - puzzleImg.getWidth() / 2;
    puzzleOriginY = WINDOW_HEIGHT / 2 - puzzleImg.getHeight() / 2;

    puzzleOutlineImg = new Texture("puzzle_outline.png");
    batch = new SpriteBatch();

    puzzlePiecesLeft = new LinkedList<>();
    puzzlePiecesInPlace = new LinkedList<>();

    preparePuzzlePieces();
  }

  @Override
  public void render () {
    handleMouse();

    Gdx.gl.glClearColor(1, 1, 1, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

    batch.begin();

    batch.draw(puzzleOutlineImg, puzzleOriginX, puzzleOriginY);

    puzzlePiecesInPlace.forEach(piece -> piece.draw(batch));
    puzzlePiecesLeft.forEach(piece -> piece.draw(batch));
    if (selectedPiece != null) {
      selectedPiece.draw(batch);
    }

    batch.end();
  }

  @Override
  public void dispose () {
    batch.dispose();
    puzzleImg.dispose();
    puzzleOutlineImg.dispose();
  }

  private void handleMouse() {
    GridPoint2 mousePosition = getMousePosMappedToScreenPos();

    if (Gdx.input.isButtonJustPressed(Input.Buttons.LEFT)) {
      ListIterator<PuzzlePiece> listIterator =
          puzzlePiecesLeft.listIterator(puzzlePiecesLeft.size());

      while (listIterator.hasPrevious()) {
        PuzzlePiece puzzlePiece = listIterator.previous();

        if (puzzlePiece.isMouseIn(mousePosition)) {
          selectedPiece = puzzlePiece;
          listIterator.remove();
          break;
        }
      }

      lastMousePosition.set(mousePosition);
    }

    if (Gdx.input.isButtonPressed(Input.Buttons.LEFT) &&
        selectedPiece != null) {

      if (isMouseInsideGameWindow()) {
        selectedPiece.moveBy(
            mousePosition.x - lastMousePosition.x,
            mousePosition.y - lastMousePosition.y
        );
        lastMousePosition.set(mousePosition);
      }
    } else if (selectedPiece != null) {
      if (selectedPiece.isPositionRight(mousePosition)) {
        selectedPiece.snapToGrid();
        puzzlePiecesInPlace.add(selectedPiece);
      } else {
        puzzlePiecesLeft.add(selectedPiece);
      }

      selectedPiece = null;
    }
  }

  private void preparePuzzlePieces() {
    int numberOfPuzzleRows =
        puzzleImg.getHeight() / PUZZLE_PIECE_HEIGHT;
    int numberOfPuzzleColumns =
        puzzleImg.getWidth() / PUZZLE_PIECE_WIDTH;

    for (int row = 0; row < numberOfPuzzleRows; row++) {
      for (int col = 0; col < numberOfPuzzleColumns; col++) {

        TextureRegion puzzlePieceImg = new TextureRegion();

        puzzlePieceImg.setTexture(puzzleImg);
        puzzlePieceImg.setRegion(
            col * PUZZLE_PIECE_WIDTH,
            row * PUZZLE_PIECE_HEIGHT,
            PUZZLE_PIECE_WIDTH,
            PUZZLE_PIECE_HEIGHT
        );

        GridPoint2 positionOnScreen =
            randomizePuzzlePiecePosition();

        GridPoint2 positionInPuzzle =
            new GridPoint2(
                puzzleOriginX + col * PUZZLE_PIECE_WIDTH,
                puzzleOriginY +
                    (numberOfPuzzleRows - 1 - row) * PUZZLE_PIECE_HEIGHT
            );

        PuzzlePiece piece = new PuzzlePiece(
            puzzlePieceImg,
            positionOnScreen,
            positionInPuzzle
        );

        puzzlePiecesLeft.add(piece);
      }
    }
  }

  private GridPoint2 randomizePuzzlePiecePosition() {
    return new GridPoint2(
        randomIntMax(WINDOW_WIDTH - PUZZLE_PIECE_WIDTH),
        randomIntMax(WINDOW_HEIGHT - PUZZLE_PIECE_HEIGHT)
    );
  }

  private int randomIntMax(int maxValue) {
    return (int) (Math.random() * (maxValue + 1));
  }

  private GridPoint2 getMousePosMappedToScreenPos() {
    return new GridPoint2(
        Gdx.input.getX(),
        WINDOW_HEIGHT - 1 - Gdx.input.getY()
    );
  }

  private boolean isMouseInsideGameWindow() {
    GridPoint2 mousePosition = getMousePosMappedToScreenPos();
    return
        mousePosition.x >= 0 &&
        mousePosition.y >= 0 &&
        mousePosition.x < WINDOW_WIDTH &&
        mousePosition.y < WINDOW_HEIGHT;
  }
}
