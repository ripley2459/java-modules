// java wrapper for vtkProgrammableElectronicData object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkProgrammableElectronicData extends vtkAbstractElectronicData
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

  private native long GetNumberOfMOs_4();
  public long GetNumberOfMOs()
  {
    return GetNumberOfMOs_4();
  }

  private native void SetNumberOfMOs_5(long id0);
  public void SetNumberOfMOs(long id0)
  {
    SetNumberOfMOs_5(id0);
  }

  private native long GetNumberOfElectrons_6();
  public long GetNumberOfElectrons()
  {
    return GetNumberOfElectrons_6();
  }

  private native void SetNumberOfElectrons_7(long id0);
  public void SetNumberOfElectrons(long id0)
  {
    SetNumberOfElectrons_7(id0);
  }

  private native long GetMO_8(long id0);
  public vtkImageData GetMO(long id0)
  {
    long temp = GetMO_8(id0);

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetMO_9(long id0,vtkImageData id1);
  public void SetMO(long id0,vtkImageData id1)
  {
    SetMO_9(id0,id1);
  }

  private native long GetElectronDensity_10();
  public vtkImageData GetElectronDensity()
  {
    long temp = GetElectronDensity_10();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetElectronDensity_11(vtkImageData id0);
  public void SetElectronDensity(vtkImageData id0)
  {
    SetElectronDensity_11(id0);
  }

  private native void SetPadding_12(double id0);
  public void SetPadding(double id0)
  {
    SetPadding_12(id0);
  }

  private native void DeepCopy_13(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_13(id0);
  }

  public vtkProgrammableElectronicData() { super(); }

  public vtkProgrammableElectronicData(long id) { super(id); }
  public native long   VTKInit();

}
