import java.util.ArrayList;

import javax.lang.model.util.ElementScanner6;

//A feladat

class IntList {
  private int _currentSize;
  private int[] _intArray;
  private int _maxSize;

  public IntList(int iMax) {
    _maxSize = iMax;
    _intArray = new int[_maxSize];
  }

  
  
  public void add(int numberToAdd) {
    if(_maxSize == _currentSize) { throw new IllegalStateException("A tomb tele van"); }
    _intArray[_currentSize++] = numberToAdd;
  }

  public void concat(IntList arrayToAdd) {
    if((_maxSize - _currentSize) >= arrayToAdd._currentSize)
      for (int i = 0; i < arrayToAdd._currentSize; i++)
        this._intArray[_currentSize++] = arrayToAdd._intArray[i];
    else
      throw new IllegalStateException("A tomb tele van");
  }

  public String toString() {
      if(_currentSize == 0) return "";

      StringBuilder sb = new StringBuilder();

      for (int i = 0; i < _currentSize-1; i++) {
        sb.append(_intArray[i]);
        sb.append(", ");
      }
      sb.append(_intArray[_currentSize-1]);
      String retval = sb.toString();
      return retval;
  }

  void removeItemsGreaterThan(int limit) {

    int size = 0;
    int templist[] = new int[_maxSize];

    for (int i = 0; i < _currentSize; i++)
      if (_intArray[i] <= limit)
        templist[size++] = _intArray[i];

    _currentSize = size;
    _intArray = templist;
  }
}

//B feladat


class IntList2 {
  private int _currentSize;
  protected ArrayList<Integer> _intList;
  private int _maxSize;

  public IntList2() {
    _intList = new ArrayList<Integer>();
  }

  public IntList2(Integer[] arr) {
    _intList = new ArrayList<Integer>();
    for (int i = 0; i < arr.length; i++) {
      _intList.add(arr[i]);
    }
  }
  public ArrayList<Integer> getData() {
    return new ArrayList<Integer>(_intList);
  }
}

//C

class NamedIntList extends IntList2 {

  private String _listName;

  public NamedIntList(String iName, Integer[] arr) {
    super(arr);
    _listName = iName;
  }
  public NamedIntList(String iName) {
    super();
    _listName = iName;
  }

  @Override
  public String toString() {
    String il = _intList.toString();
    return this._listName + ": " + il;
  }
}


public class nyolcadikhazi {

  public static void main(String[] args) {

    IntList il = new IntList(5);
    IntList il2 = new IntList(5);
    System.out.println(il.toString());
    il.add(3);
    il.add(2);
    il.add(4);

    il2.add(9);
    il2.add(8);
    il2.add(7);

    System.out.println(il.toString());
    il.removeItemsGreaterThan(3);

    System.out.println(il.toString());

    il.concat(il2);

    System.out.println(il.toString());
    //il.concat(marr); hibat dob, ahogy kell
    
    Integer[] lastarr = {1,2,3,4,5,6};
    NamedIntList lista = new NamedIntList("gtlib", lastarr);
    System.out.println(lista.toString());

  }
}