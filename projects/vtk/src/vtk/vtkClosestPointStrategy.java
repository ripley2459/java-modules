// java wrapper for vtkClosestPointStrategy object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkClosestPointStrategy extends vtkFindCellStrategy
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

  private native int Initialize_4(vtkPointSet id0);
  public int Initialize(vtkPointSet id0)
  {
    return Initialize_4(id0);
  }

  private native boolean InsideCellBounds_5(double id0[],long id1);
  public boolean InsideCellBounds(double id0[],long id1)
  {
    return InsideCellBounds_5(id0,id1);
  }

  private native void SetPointLocator_6(vtkAbstractPointLocator id0);
  public void SetPointLocator(vtkAbstractPointLocator id0)
  {
    SetPointLocator_6(id0);
  }

  private native long GetPointLocator_7();
  public vtkAbstractPointLocator GetPointLocator()
  {
    long temp = GetPointLocator_7();

    if (temp == 0) return null;
    return (vtkAbstractPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long SelectCell_8(vtkPointSet id0,long id1,vtkCell id2,vtkGenericCell id3);
  public vtkCell SelectCell(vtkPointSet id0,long id1,vtkCell id2,vtkGenericCell id3)
  {
    long temp = SelectCell_8(id0,id1,id2,id3);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CopyParameters_9(vtkFindCellStrategy id0);
  public void CopyParameters(vtkFindCellStrategy id0)
  {
    CopyParameters_9(id0);
  }

  public vtkClosestPointStrategy() { super(); }

  public vtkClosestPointStrategy(long id) { super(id); }
  public native long   VTKInit();

}
