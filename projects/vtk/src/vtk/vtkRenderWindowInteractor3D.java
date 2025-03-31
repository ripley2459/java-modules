// java wrapper for vtkRenderWindowInteractor3D object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkRenderWindowInteractor3D extends vtkRenderWindowInteractor
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

  private native void Enable_4();
  public void Enable()
  {
    Enable_4();
  }

  private native void Disable_5();
  public void Disable()
  {
    Disable_5();
  }

  private native void GetWorldEventPose_6(vtkMatrix4x4 id0,int id1);
  public void GetWorldEventPose(vtkMatrix4x4 id0,int id1)
  {
    GetWorldEventPose_6(id0,id1);
  }

  private native void GetLastWorldEventPose_7(vtkMatrix4x4 id0,int id1);
  public void GetLastWorldEventPose(vtkMatrix4x4 id0,int id1)
  {
    GetLastWorldEventPose_7(id0,id1);
  }

  private native void SetPhysicalEventPosition_8(double id0,double id1,double id2,int id3);
  public void SetPhysicalEventPosition(double id0,double id1,double id2,int id3)
  {
    SetPhysicalEventPosition_8(id0,id1,id2,id3);
  }

  private native void SetPhysicalEventPose_9(vtkMatrix4x4 id0,int id1);
  public void SetPhysicalEventPose(vtkMatrix4x4 id0,int id1)
  {
    SetPhysicalEventPose_9(id0,id1);
  }

  private native void GetPhysicalEventPose_10(vtkMatrix4x4 id0,int id1);
  public void GetPhysicalEventPose(vtkMatrix4x4 id0,int id1)
  {
    GetPhysicalEventPose_10(id0,id1);
  }

  private native void GetLastPhysicalEventPose_11(vtkMatrix4x4 id0,int id1);
  public void GetLastPhysicalEventPose(vtkMatrix4x4 id0,int id1)
  {
    GetLastPhysicalEventPose_11(id0,id1);
  }

  private native void GetStartingPhysicalEventPose_12(vtkMatrix4x4 id0,int id1);
  public void GetStartingPhysicalEventPose(vtkMatrix4x4 id0,int id1)
  {
    GetStartingPhysicalEventPose_12(id0,id1);
  }

  private native void SetWorldEventPosition_13(double id0,double id1,double id2,int id3);
  public void SetWorldEventPosition(double id0,double id1,double id2,int id3)
  {
    SetWorldEventPosition_13(id0,id1,id2,id3);
  }

  private native void SetWorldEventOrientation_14(double id0,double id1,double id2,double id3,int id4);
  public void SetWorldEventOrientation(double id0,double id1,double id2,double id3,int id4)
  {
    SetWorldEventOrientation_14(id0,id1,id2,id3,id4);
  }

  private native void SetWorldEventPose_15(vtkMatrix4x4 id0,int id1);
  public void SetWorldEventPose(vtkMatrix4x4 id0,int id1)
  {
    SetWorldEventPose_15(id0,id1);
  }

  private native void RightButtonPressEvent_16();
  public void RightButtonPressEvent()
  {
    RightButtonPressEvent_16();
  }

  private native void RightButtonReleaseEvent_17();
  public void RightButtonReleaseEvent()
  {
    RightButtonReleaseEvent_17();
  }

  private native void MiddleButtonPressEvent_18();
  public void MiddleButtonPressEvent()
  {
    MiddleButtonPressEvent_18();
  }

  private native void MiddleButtonReleaseEvent_19();
  public void MiddleButtonReleaseEvent()
  {
    MiddleButtonReleaseEvent_19();
  }

  private native void SetPhysicalViewDirection_20(double id0,double id1,double id2);
  public void SetPhysicalViewDirection(double id0,double id1,double id2)
  {
    SetPhysicalViewDirection_20(id0,id1,id2);
  }

  private native void SetPhysicalViewUp_21(double id0,double id1,double id2);
  public void SetPhysicalViewUp(double id0,double id1,double id2)
  {
    SetPhysicalViewUp_21(id0,id1,id2);
  }

  private native void SetPhysicalTranslation_22(vtkCamera id0,double id1,double id2,double id3);
  public void SetPhysicalTranslation(vtkCamera id0,double id1,double id2,double id3)
  {
    SetPhysicalTranslation_22(id0,id1,id2,id3);
  }

  private native void SetPhysicalScale_23(double id0);
  public void SetPhysicalScale(double id0)
  {
    SetPhysicalScale_23(id0);
  }

  private native double GetPhysicalScale_24();
  public double GetPhysicalScale()
  {
    return GetPhysicalScale_24();
  }

  private native void SetTranslation3D_25(double id0[]);
  public void SetTranslation3D(double id0[])
  {
    SetTranslation3D_25(id0);
  }

  private native double[] GetTranslation3D_26();
  public double[] GetTranslation3D()
  {
    return GetTranslation3D_26();
  }

  private native double[] GetLastTranslation3D_27();
  public double[] GetLastTranslation3D()
  {
    return GetLastTranslation3D_27();
  }

  public vtkRenderWindowInteractor3D() { super(); }

  public vtkRenderWindowInteractor3D(long id) { super(id); }
  public native long   VTKInit();

}
