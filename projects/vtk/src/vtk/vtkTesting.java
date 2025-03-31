// java wrapper for vtkTesting object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkTesting extends vtkObject
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

  private native void FrontBufferOn_4();
  public void FrontBufferOn()
  {
    FrontBufferOn_4();
  }

  private native void FrontBufferOff_5();
  public void FrontBufferOff()
  {
    FrontBufferOff_5();
  }

  private native int GetFrontBuffer_6();
  public int GetFrontBuffer()
  {
    return GetFrontBuffer_6();
  }

  private native void SetFrontBuffer_7(int id0);
  public void SetFrontBuffer(int id0)
  {
    SetFrontBuffer_7(id0);
  }

  private native int RegressionTest_8(double id0);
  public int RegressionTest(double id0)
  {
    return RegressionTest_8(id0);
  }

  private native int RegressionTest_9(byte[] id0, int len0,double id1);
  public int RegressionTest(String id0,double id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return RegressionTest_9(bytes0, bytes0.length,id1);
  }

  private native int RegressionTest_10(vtkAlgorithm id0,double id1);
  public int RegressionTest(vtkAlgorithm id0,double id1)
  {
    return RegressionTest_10(id0,id1);
  }

  private native int CompareAverageOfL2Norm_11(vtkDataSet id0,vtkDataSet id1,double id2);
  public int CompareAverageOfL2Norm(vtkDataSet id0,vtkDataSet id1,double id2)
  {
    return CompareAverageOfL2Norm_11(id0,id1,id2);
  }

  private native int CompareAverageOfL2Norm_12(vtkDataArray id0,vtkDataArray id1,double id2);
  public int CompareAverageOfL2Norm(vtkDataArray id0,vtkDataArray id1,double id2)
  {
    return CompareAverageOfL2Norm_12(id0,id1,id2);
  }

  private native void SetRenderWindow_13(vtkRenderWindow id0);
  public void SetRenderWindow(vtkRenderWindow id0)
  {
    SetRenderWindow_13(id0);
  }

  private native long GetRenderWindow_14();
  public vtkRenderWindow GetRenderWindow()
  {
    long temp = GetRenderWindow_14();

    if (temp == 0) return null;
    return (vtkRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean GetMesaVersion_15(vtkRenderWindow id0,int id1[]);
  public boolean GetMesaVersion(vtkRenderWindow id0,int id1[])
  {
    return GetMesaVersion_15(id0,id1);
  }

  private native void SetValidImageFileName_16(byte[] id0, int len0);
  public void SetValidImageFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetValidImageFileName_16(bytes0, bytes0.length);
  }

  private native byte[] GetValidImageFileName_17();
  public String GetValidImageFileName()
  {
    return new String(GetValidImageFileName_17(), StandardCharsets.UTF_8);
  }

  private native double GetImageDifference_18();
  public double GetImageDifference()
  {
    return GetImageDifference_18();
  }

  private native void AddArgument_19(byte[] id0, int len0);
  public void AddArgument(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddArgument_19(bytes0, bytes0.length);
  }

  private native byte[] GetArgument_20(byte[] id0, int len0);
  public String GetArgument(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return new String(GetArgument_20(bytes0, bytes0.length), StandardCharsets.UTF_8);
  }

  private native void CleanArguments_21();
  public void CleanArguments()
  {
    CleanArguments_21();
  }

  private native byte[] GetDataRoot_22();
  public String GetDataRoot()
  {
    return new String(GetDataRoot_22(), StandardCharsets.UTF_8);
  }

  private native void SetDataRoot_23(byte[] id0, int len0);
  public void SetDataRoot(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDataRoot_23(bytes0, bytes0.length);
  }

  private native byte[] GetTempDirectory_24();
  public String GetTempDirectory()
  {
    return new String(GetTempDirectory_24(), StandardCharsets.UTF_8);
  }

  private native void SetTempDirectory_25(byte[] id0, int len0);
  public void SetTempDirectory(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTempDirectory_25(bytes0, bytes0.length);
  }

  private native int IsValidImageSpecified_26();
  public int IsValidImageSpecified()
  {
    return IsValidImageSpecified_26();
  }

  private native int IsInteractiveModeSpecified_27();
  public int IsInteractiveModeSpecified()
  {
    return IsInteractiveModeSpecified_27();
  }

  private native int IsFlagSpecified_28(byte[] id0, int len0);
  public int IsFlagSpecified(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsFlagSpecified_28(bytes0, bytes0.length);
  }

  private native void SetBorderOffset_29(int id0);
  public void SetBorderOffset(int id0)
  {
    SetBorderOffset_29(id0);
  }

  private native int GetBorderOffset_30();
  public int GetBorderOffset()
  {
    return GetBorderOffset_30();
  }

  private native void SetVerbose_31(int id0);
  public void SetVerbose(int id0)
  {
    SetVerbose_31(id0);
  }

  private native int GetVerbose_32();
  public int GetVerbose()
  {
    return GetVerbose_32();
  }

  private native long GetController_33();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_33();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetController_34(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_34(id0);
  }

  public vtkTesting() { super(); }

  public vtkTesting(long id) { super(id); }
  public native long   VTKInit();

}
