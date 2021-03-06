package de.htwg.se.sudoku.model.gridComponent.gridMockImpl

import de.htwg.se.sudoku.model.gridComponent.{CellInterface, GridInterface}
import play.api.libs.json.{JsValue, Json}

class Grid(var size:Int) extends GridInterface{

  size=1

   def cell(row: Int, col: Int): CellInterface = EmptyCell

   def set(row: Int, col: Int, value: Int): GridInterface = this

   def highlight(index: Int): GridInterface = this

   def setShowCandidates(row: Int, col: Int): GridInterface = this

   def createNewGrid: GridInterface = this

   def solve: (Boolean, GridInterface) = (true, this)

   def valid: Boolean = true

   def solved: Boolean = false

   def isHighlighted(row: Int, col: Int): Boolean = false

   def available(row: Int, col: Int): Set[Int] = Set(1)

   def reset(row: Int, col: Int): GridInterface = this

   def indexToRowCol(index: Int): (Int, Int) = (0,0)

   def markFilledCellsAsGiven: GridInterface = this

   def isSymmetric:Boolean = true

  override def toJson(): JsValue = Json.obj()

  override def setGiven(row: Int, col: Int, value: Int): GridInterface = this
}

object EmptyCell extends CellInterface {
   def value: Int = 0

   def showCandidates: Boolean = false

   def given: Boolean = false

   def isSet: Boolean = false
}
