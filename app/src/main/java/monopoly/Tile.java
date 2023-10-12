package monopoly;

import java.util.ArrayList;

/**
 * Represents a double linked list of game tiles.
 */
public abstract class Tile {
  // These are the only fields you need.
  private Tile next;
  private Tile prev;

  // a tile knows what objects (players) are currently on the tile, these are
  // never used for anything else than comparing object references
  // thus we can store them at the highest level of abstraction - as Object
  // instances
  ArrayList<Object> playersOnTile;

  /**
   * Creates a new Tile object with no previous or next tiles in the linked list.
   * All fields are set to null.
   */
  protected Tile() {
    playersOnTile = new ArrayList<>();
    prev = next = this;
  }

  /**
   * The list of players on this tile is initialized as an empty ArrayList.
   */

  protected Tile(Tile prevTile) {
    playersOnTile = new ArrayList<>();
    prev = prevTile;
    next = prevTile.next;
    prevTile.next.prev = this;
    prevTile.next = this;
  }

  public Tile getNext() {
    return next;
  }

  public Tile getPrev() {
    return prev;
  }

  /**
   * Checks if a player is on the tile.
   */
  public boolean isOnTile(Player player) {
    return playersOnTile.contains(player);
  }

  /**
   * Called when a player moves over a tile.
   */
  public abstract void visit(Player player);

  /**
   * Called when a player stops on a tile.
   * Subclasses need to call super if overridden.
   */
  public void stoppedOn(Player player) {
    playersOnTile.add(player);
  }

  /**
   * Called when a player moves away from the tile stopped on.
   * Subclasses need to call super if overridden.
   */
  public void startOn(Player player) {
    playersOnTile.remove(player);
  }

  /**
   * Called when a player wants to buy a tile.
   */
  public abstract boolean buy(Player player);
}
