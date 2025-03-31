// java wrapper for vtkImporter object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkImporter extends vtkObject
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

  private native long GetRenderer_4();
  public vtkRenderer GetRenderer()
  {
    long temp = GetRenderer_4();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRenderWindow_5(vtkRenderWindow id0);
  public void SetRenderWindow(vtkRenderWindow id0)
  {
    SetRenderWindow_5(id0);
  }

  private native long GetRenderWindow_6();
  public vtkRenderWindow GetRenderWindow()
  {
    long temp = GetRenderWindow_6();

    if (temp == 0) return null;
    return (vtkRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Read_7();
  public void Read()
  {
    Read_7();
  }

  private native void Update_8();
  public void Update()
  {
    Update_8();
  }

  private native byte[] GetOutputsDescription_9();
  public String GetOutputsDescription()
  {
    return new String(GetOutputsDescription_9(), StandardCharsets.UTF_8);
  }

  private native long GetNumberOfAnimations_10();
  public long GetNumberOfAnimations()
  {
    return GetNumberOfAnimations_10();
  }

  private native byte[] GetAnimationName_11(long id0);
  public String GetAnimationName(long id0)
  {
    return new String(GetAnimationName_11(id0), StandardCharsets.UTF_8);
  }

  private native void EnableAnimation_12(long id0);
  public void EnableAnimation(long id0)
  {
    EnableAnimation_12(id0);
  }

  private native void DisableAnimation_13(long id0);
  public void DisableAnimation(long id0)
  {
    DisableAnimation_13(id0);
  }

  private native boolean IsAnimationEnabled_14(long id0);
  public boolean IsAnimationEnabled(long id0)
  {
    return IsAnimationEnabled_14(id0);
  }

  private native long GetNumberOfCameras_15();
  public long GetNumberOfCameras()
  {
    return GetNumberOfCameras_15();
  }

  private native byte[] GetCameraName_16(long id0);
  public String GetCameraName(long id0)
  {
    return new String(GetCameraName_16(id0), StandardCharsets.UTF_8);
  }

  private native void SetCamera_17(long id0);
  public void SetCamera(long id0)
  {
    SetCamera_17(id0);
  }

  private native void UpdateTimeStep_18(double id0);
  public void UpdateTimeStep(double id0)
  {
    UpdateTimeStep_18(id0);
  }

  public vtkImporter() { super(); }

  public vtkImporter(long id) { super(id); }

}
