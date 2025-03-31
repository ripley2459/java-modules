// java wrapper for vtkHyperTreeGridMapper object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkHyperTreeGridMapper extends vtkMapper
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

  private native void SetInputDataObject_4(int id0,vtkDataObject id1);
  public void SetInputDataObject(int id0,vtkDataObject id1)
  {
    SetInputDataObject_4(id0,id1);
  }

  private native void SetInputDataObject_5(vtkDataObject id0);
  public void SetInputDataObject(vtkDataObject id0)
  {
    SetInputDataObject_5(id0);
  }

  private native void GetBounds_6(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_6(id0);
  }

  private native boolean GetUseAdaptiveDecimation_7();
  public boolean GetUseAdaptiveDecimation()
  {
    return GetUseAdaptiveDecimation_7();
  }

  private native void SetUseAdaptiveDecimation_8(boolean id0);
  public void SetUseAdaptiveDecimation(boolean id0)
  {
    SetUseAdaptiveDecimation_8(id0);
  }

  private native void UseAdaptiveDecimationOn_9();
  public void UseAdaptiveDecimationOn()
  {
    UseAdaptiveDecimationOn_9();
  }

  private native void UseAdaptiveDecimationOff_10();
  public void UseAdaptiveDecimationOff()
  {
    UseAdaptiveDecimationOff_10();
  }

  private native void Render_11(vtkRenderer id0,vtkActor id1);
  public void Render(vtkRenderer id0,vtkActor id1)
  {
    Render_11(id0,id1);
  }

  private native int FillInputPortInformation_12(int id0,vtkInformation id1);
  public int FillInputPortInformation(int id0,vtkInformation id1)
  {
    return FillInputPortInformation_12(id0,id1);
  }

  private native void SetInputConnection_13(int id0,vtkAlgorithmOutput id1);
  public void SetInputConnection(int id0,vtkAlgorithmOutput id1)
  {
    SetInputConnection_13(id0,id1);
  }

  private native void SetInputConnection_14(vtkAlgorithmOutput id0);
  public void SetInputConnection(vtkAlgorithmOutput id0)
  {
    SetInputConnection_14(id0);
  }

  public vtkHyperTreeGridMapper() { super(); }

  public vtkHyperTreeGridMapper(long id) { super(id); }
  public native long   VTKInit();

}
