// java wrapper for vtkDGAttributeInformation object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkDGAttributeInformation extends vtkCellAttributeInformation
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

  private native int GetBasisOrder_4();
  public int GetBasisOrder()
  {
    return GetBasisOrder_4();
  }

  private native int GetBasisValueSize_5();
  public int GetBasisValueSize()
  {
    return GetBasisValueSize_5();
  }

  private native int GetNumberOfBasisFunctions_6();
  public int GetNumberOfBasisFunctions()
  {
    return GetNumberOfBasisFunctions_6();
  }

  private native int GetDegreeOfFreedomSize_7();
  public int GetDegreeOfFreedomSize()
  {
    return GetDegreeOfFreedomSize_7();
  }

  private native boolean GetSharedDegreesOfFreedom_8();
  public boolean GetSharedDegreesOfFreedom()
  {
    return GetSharedDegreesOfFreedom_8();
  }

  private native byte[] GetBasisName_9();
  public String GetBasisName()
  {
    return new String(GetBasisName_9(), StandardCharsets.UTF_8);
  }

  private native byte[] BasisShapeName_10(vtkDGCell id0);
  public String BasisShapeName(vtkDGCell id0)
  {
    return new String(BasisShapeName_10(id0), StandardCharsets.UTF_8);
  }

  public vtkDGAttributeInformation() { super(); }

  public vtkDGAttributeInformation(long id) { super(id); }
  public native long   VTKInit();

}
