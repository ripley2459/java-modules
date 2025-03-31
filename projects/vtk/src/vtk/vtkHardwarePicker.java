// java wrapper for vtkHardwarePicker object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkHardwarePicker extends vtkAbstractPropPicker
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

  private native void SetSnapToMeshPoint_4(boolean id0);
  public void SetSnapToMeshPoint(boolean id0)
  {
    SetSnapToMeshPoint_4(id0);
  }

  private native boolean GetSnapToMeshPoint_5();
  public boolean GetSnapToMeshPoint()
  {
    return GetSnapToMeshPoint_5();
  }

  private native void SnapToMeshPointOn_6();
  public void SnapToMeshPointOn()
  {
    SnapToMeshPointOn_6();
  }

  private native void SnapToMeshPointOff_7();
  public void SnapToMeshPointOff()
  {
    SnapToMeshPointOff_7();
  }

  private native void SetPixelTolerance_8(int id0);
  public void SetPixelTolerance(int id0)
  {
    SetPixelTolerance_8(id0);
  }

  private native int GetPixelTolerance_9();
  public int GetPixelTolerance()
  {
    return GetPixelTolerance_9();
  }

  private native long GetMapper_10();
  public vtkAbstractMapper3D GetMapper()
  {
    long temp = GetMapper_10();

    if (temp == 0) return null;
    return (vtkAbstractMapper3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDataSet_11();
  public vtkDataSet GetDataSet()
  {
    long temp = GetDataSet_11();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCompositeDataSet_12();
  public vtkCompositeDataSet GetCompositeDataSet()
  {
    long temp = GetCompositeDataSet_12();

    if (temp == 0) return null;
    return (vtkCompositeDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFlatBlockIndex_13();
  public long GetFlatBlockIndex()
  {
    return GetFlatBlockIndex_13();
  }

  private native long GetPointId_14();
  public long GetPointId()
  {
    return GetPointId_14();
  }

  private native long GetCellId_15();
  public long GetCellId()
  {
    return GetCellId_15();
  }

  private native int GetSubId_16();
  public int GetSubId()
  {
    return GetSubId_16();
  }

  private native double[] GetPCoords_17();
  public double[] GetPCoords()
  {
    return GetPCoords_17();
  }

  private native double[] GetPickNormal_18();
  public double[] GetPickNormal()
  {
    return GetPickNormal_18();
  }

  private native boolean GetNormalFlipped_19();
  public boolean GetNormalFlipped()
  {
    return GetNormalFlipped_19();
  }

  private native int Pick_20(double id0,double id1,double id2,vtkRenderer id3);
  public int Pick(double id0,double id1,double id2,vtkRenderer id3)
  {
    return Pick_20(id0,id1,id2,id3);
  }

  public vtkHardwarePicker() { super(); }

  public vtkHardwarePicker(long id) { super(id); }
  public native long   VTKInit();

}
