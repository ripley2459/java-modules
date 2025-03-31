// java wrapper for vtkGLTFReader object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkGLTFReader extends vtkMultiBlockDataSetAlgorithm
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

  private native long GetNumberOfTextures_4();
  public long GetNumberOfTextures()
  {
    return GetNumberOfTextures_4();
  }

  private native void SetFileName_5(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_5(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_6();
  public String GetFileName()
  {
    return new String(GetFileName_6(), StandardCharsets.UTF_8);
  }

  private native void SetStream_7(vtkResourceStream id0);
  public void SetStream(vtkResourceStream id0)
  {
    SetStream_7(id0);
  }

  private native long GetStream_8();
  public vtkResourceStream GetStream()
  {
    long temp = GetStream_8();

    if (temp == 0) return null;
    return (vtkResourceStream)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetURILoader_9(vtkURILoader id0);
  public void SetURILoader(vtkURILoader id0)
  {
    SetURILoader_9(id0);
  }

  private native long GetURILoader_10();
  public vtkURILoader GetURILoader()
  {
    long temp = GetURILoader_10();

    if (temp == 0) return null;
    return (vtkURILoader)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetApplyDeformationsToGeometry_11(boolean id0);
  public void SetApplyDeformationsToGeometry(boolean id0)
  {
    SetApplyDeformationsToGeometry_11(id0);
  }

  private native boolean GetApplyDeformationsToGeometry_12();
  public boolean GetApplyDeformationsToGeometry()
  {
    return GetApplyDeformationsToGeometry_12();
  }

  private native void ApplyDeformationsToGeometryOn_13();
  public void ApplyDeformationsToGeometryOn()
  {
    ApplyDeformationsToGeometryOn_13();
  }

  private native void ApplyDeformationsToGeometryOff_14();
  public void ApplyDeformationsToGeometryOff()
  {
    ApplyDeformationsToGeometryOff_14();
  }

  private native long GetNumberOfAnimations_15();
  public long GetNumberOfAnimations()
  {
    return GetNumberOfAnimations_15();
  }

  private native byte[] GetAnimationName_16(long id0);
  public String GetAnimationName(long id0)
  {
    return new String(GetAnimationName_16(id0), StandardCharsets.UTF_8);
  }

  private native float GetAnimationDuration_17(long id0);
  public float GetAnimationDuration(long id0)
  {
    return GetAnimationDuration_17(id0);
  }

  private native void EnableAnimation_18(long id0);
  public void EnableAnimation(long id0)
  {
    EnableAnimation_18(id0);
  }

  private native void DisableAnimation_19(long id0);
  public void DisableAnimation(long id0)
  {
    DisableAnimation_19(id0);
  }

  private native boolean IsAnimationEnabled_20(long id0);
  public boolean IsAnimationEnabled(long id0)
  {
    return IsAnimationEnabled_20(id0);
  }

  private native byte[] GetSceneName_21(long id0);
  public String GetSceneName(long id0)
  {
    return new String(GetSceneName_21(id0), StandardCharsets.UTF_8);
  }

  private native long GetNumberOfScenes_22();
  public long GetNumberOfScenes()
  {
    return GetNumberOfScenes_22();
  }

  private native long GetCurrentScene_23();
  public long GetCurrentScene()
  {
    return GetCurrentScene_23();
  }

  private native void SetCurrentScene_24(long id0);
  public void SetCurrentScene(long id0)
  {
    SetCurrentScene_24(id0);
  }

  private native void SetScene_25(byte[] id0, int len0);
  public void SetScene(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetScene_25(bytes0, bytes0.length);
  }

  private native int GetFrameRate_26();
  public int GetFrameRate()
  {
    return GetFrameRate_26();
  }

  private native void SetFrameRate_27(int id0);
  public void SetFrameRate(int id0)
  {
    SetFrameRate_27(id0);
  }

  private native long GetAllSceneNames_28();
  public vtkStringArray GetAllSceneNames()
  {
    long temp = GetAllSceneNames_28();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAnimationSelection_29();
  public vtkDataArraySelection GetAnimationSelection()
  {
    long temp = GetAnimationSelection_29();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkGLTFReader() { super(); }

  public vtkGLTFReader(long id) { super(id); }
  public native long   VTKInit();

}
