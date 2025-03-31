// java wrapper for vtkFillHolesFilter object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkFillHolesFilter extends vtkPolyDataAlgorithm
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

  private native void SetHoleSize_4(double id0);
  public void SetHoleSize(double id0)
  {
    SetHoleSize_4(id0);
  }

  private native double GetHoleSizeMinValue_5();
  public double GetHoleSizeMinValue()
  {
    return GetHoleSizeMinValue_5();
  }

  private native double GetHoleSizeMaxValue_6();
  public double GetHoleSizeMaxValue()
  {
    return GetHoleSizeMaxValue_6();
  }

  private native double GetHoleSize_7();
  public double GetHoleSize()
  {
    return GetHoleSize_7();
  }

  public vtkFillHolesFilter() { super(); }

  public vtkFillHolesFilter(long id) { super(id); }
  public native long   VTKInit();

}
