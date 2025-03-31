// java wrapper for vtkIncrementalPointLocator object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkIncrementalPointLocator extends vtkAbstractPointLocator
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native long FindClosestInsertedPoint_4(double id0[]);
  public long FindClosestInsertedPoint(double id0[])
  {
    return FindClosestInsertedPoint_4(id0);
  }

  private native int InitPointInsertion_5(vtkPoints id0,double id1[]);
  public int InitPointInsertion(vtkPoints id0,double id1[])
  {
    return InitPointInsertion_5(id0,id1);
  }

  private native int InitPointInsertion_6(vtkPoints id0,double id1[],long id2);
  public int InitPointInsertion(vtkPoints id0,double id1[],long id2)
  {
    return InitPointInsertion_6(id0,id1,id2);
  }

  private native long IsInsertedPoint_7(double id0,double id1,double id2);
  public long IsInsertedPoint(double id0,double id1,double id2)
  {
    return IsInsertedPoint_7(id0,id1,id2);
  }

  private native long IsInsertedPoint_8(double id0[]);
  public long IsInsertedPoint(double id0[])
  {
    return IsInsertedPoint_8(id0);
  }

  private native void InsertPoint_9(long id0,double id1[]);
  public void InsertPoint(long id0,double id1[])
  {
    InsertPoint_9(id0,id1);
  }

  private native long InsertNextPoint_10(double id0[]);
  public long InsertNextPoint(double id0[])
  {
    return InsertNextPoint_10(id0);
  }

  public vtkIncrementalPointLocator() { super(); }

  public vtkIncrementalPointLocator(long id) { super(id); }

}
