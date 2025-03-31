// java wrapper for vtkSkybox object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkSkybox extends vtkActor
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

  private native int GetProjection_4();
  public int GetProjection()
  {
    return GetProjection_4();
  }

  private native void SetProjection_5(int id0);
  public void SetProjection(int id0)
  {
    SetProjection_5(id0);
  }

  private native void SetProjectionToCube_6();
  public void SetProjectionToCube()
  {
    SetProjectionToCube_6();
  }

  private native void SetProjectionToSphere_7();
  public void SetProjectionToSphere()
  {
    SetProjectionToSphere_7();
  }

  private native void SetProjectionToStereoSphere_8();
  public void SetProjectionToStereoSphere()
  {
    SetProjectionToStereoSphere_8();
  }

  private native void SetProjectionToFloor_9();
  public void SetProjectionToFloor()
  {
    SetProjectionToFloor_9();
  }

  private native void SetFloorPlane_10(float id0,float id1,float id2,float id3);
  public void SetFloorPlane(float id0,float id1,float id2,float id3)
  {
    SetFloorPlane_10(id0,id1,id2,id3);
  }

  private native void SetFloorPlane_11(float id0[]);
  public void SetFloorPlane(float id0[])
  {
    SetFloorPlane_11(id0);
  }

  private native float[] GetFloorPlane_12();
  public float[] GetFloorPlane()
  {
    return GetFloorPlane_12();
  }

  private native void SetFloorRight_13(float id0,float id1,float id2);
  public void SetFloorRight(float id0,float id1,float id2)
  {
    SetFloorRight_13(id0,id1,id2);
  }

  private native void SetFloorRight_14(float id0[]);
  public void SetFloorRight(float id0[])
  {
    SetFloorRight_14(id0);
  }

  private native float[] GetFloorRight_15();
  public float[] GetFloorRight()
  {
    return GetFloorRight_15();
  }

  private native boolean GetGammaCorrect_16();
  public boolean GetGammaCorrect()
  {
    return GetGammaCorrect_16();
  }

  private native void SetGammaCorrect_17(boolean id0);
  public void SetGammaCorrect(boolean id0)
  {
    SetGammaCorrect_17(id0);
  }

  private native void GammaCorrectOn_18();
  public void GammaCorrectOn()
  {
    GammaCorrectOn_18();
  }

  private native void GammaCorrectOff_19();
  public void GammaCorrectOff()
  {
    GammaCorrectOff_19();
  }

  private native void GetBounds_20(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_20(id0);
  }

  public vtkSkybox() { super(); }

  public vtkSkybox(long id) { super(id); }
  public native long   VTKInit();

}
