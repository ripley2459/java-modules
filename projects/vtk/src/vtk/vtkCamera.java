// java wrapper for vtkCamera object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkCamera extends vtkObject
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

  private native void SetPosition_4(double id0,double id1,double id2);
  public void SetPosition(double id0,double id1,double id2)
  {
    SetPosition_4(id0,id1,id2);
  }

  private native void SetPosition_5(double id0[]);
  public void SetPosition(double id0[])
  {
    SetPosition_5(id0);
  }

  private native double[] GetPosition_6();
  public double[] GetPosition()
  {
    return GetPosition_6();
  }

  private native void SetFocalPoint_7(double id0,double id1,double id2);
  public void SetFocalPoint(double id0,double id1,double id2)
  {
    SetFocalPoint_7(id0,id1,id2);
  }

  private native void SetFocalPoint_8(double id0[]);
  public void SetFocalPoint(double id0[])
  {
    SetFocalPoint_8(id0);
  }

  private native double[] GetFocalPoint_9();
  public double[] GetFocalPoint()
  {
    return GetFocalPoint_9();
  }

  private native void SetViewUp_10(double id0,double id1,double id2);
  public void SetViewUp(double id0,double id1,double id2)
  {
    SetViewUp_10(id0,id1,id2);
  }

  private native void SetViewUp_11(double id0[]);
  public void SetViewUp(double id0[])
  {
    SetViewUp_11(id0);
  }

  private native double[] GetViewUp_12();
  public double[] GetViewUp()
  {
    return GetViewUp_12();
  }

  private native void OrthogonalizeViewUp_13();
  public void OrthogonalizeViewUp()
  {
    OrthogonalizeViewUp_13();
  }

  private native void SetDistance_14(double id0);
  public void SetDistance(double id0)
  {
    SetDistance_14(id0);
  }

  private native double GetDistance_15();
  public double GetDistance()
  {
    return GetDistance_15();
  }

  private native double[] GetDirectionOfProjection_16();
  public double[] GetDirectionOfProjection()
  {
    return GetDirectionOfProjection_16();
  }

  private native void Dolly_17(double id0);
  public void Dolly(double id0)
  {
    Dolly_17(id0);
  }

  private native void SetRoll_18(double id0);
  public void SetRoll(double id0)
  {
    SetRoll_18(id0);
  }

  private native double GetRoll_19();
  public double GetRoll()
  {
    return GetRoll_19();
  }

  private native void Roll_20(double id0);
  public void Roll(double id0)
  {
    Roll_20(id0);
  }

  private native void Azimuth_21(double id0);
  public void Azimuth(double id0)
  {
    Azimuth_21(id0);
  }

  private native void Yaw_22(double id0);
  public void Yaw(double id0)
  {
    Yaw_22(id0);
  }

  private native void Elevation_23(double id0);
  public void Elevation(double id0)
  {
    Elevation_23(id0);
  }

  private native void Pitch_24(double id0);
  public void Pitch(double id0)
  {
    Pitch_24(id0);
  }

  private native void SetParallelProjection_25(int id0);
  public void SetParallelProjection(int id0)
  {
    SetParallelProjection_25(id0);
  }

  private native int GetParallelProjection_26();
  public int GetParallelProjection()
  {
    return GetParallelProjection_26();
  }

  private native void ParallelProjectionOn_27();
  public void ParallelProjectionOn()
  {
    ParallelProjectionOn_27();
  }

  private native void ParallelProjectionOff_28();
  public void ParallelProjectionOff()
  {
    ParallelProjectionOff_28();
  }

  private native void SetUseHorizontalViewAngle_29(int id0);
  public void SetUseHorizontalViewAngle(int id0)
  {
    SetUseHorizontalViewAngle_29(id0);
  }

  private native int GetUseHorizontalViewAngle_30();
  public int GetUseHorizontalViewAngle()
  {
    return GetUseHorizontalViewAngle_30();
  }

  private native void UseHorizontalViewAngleOn_31();
  public void UseHorizontalViewAngleOn()
  {
    UseHorizontalViewAngleOn_31();
  }

  private native void UseHorizontalViewAngleOff_32();
  public void UseHorizontalViewAngleOff()
  {
    UseHorizontalViewAngleOff_32();
  }

  private native void SetViewAngle_33(double id0);
  public void SetViewAngle(double id0)
  {
    SetViewAngle_33(id0);
  }

  private native double GetViewAngle_34();
  public double GetViewAngle()
  {
    return GetViewAngle_34();
  }

  private native void SetParallelScale_35(double id0);
  public void SetParallelScale(double id0)
  {
    SetParallelScale_35(id0);
  }

  private native double GetParallelScale_36();
  public double GetParallelScale()
  {
    return GetParallelScale_36();
  }

  private native void Zoom_37(double id0);
  public void Zoom(double id0)
  {
    Zoom_37(id0);
  }

  private native void SetClippingRange_38(double id0,double id1);
  public void SetClippingRange(double id0,double id1)
  {
    SetClippingRange_38(id0,id1);
  }

  private native void SetClippingRange_39(double id0[]);
  public void SetClippingRange(double id0[])
  {
    SetClippingRange_39(id0);
  }

  private native double[] GetClippingRange_40();
  public double[] GetClippingRange()
  {
    return GetClippingRange_40();
  }

  private native void SetThickness_41(double id0);
  public void SetThickness(double id0)
  {
    SetThickness_41(id0);
  }

  private native double GetThickness_42();
  public double GetThickness()
  {
    return GetThickness_42();
  }

  private native void SetWindowCenter_43(double id0,double id1);
  public void SetWindowCenter(double id0,double id1)
  {
    SetWindowCenter_43(id0,id1);
  }

  private native double[] GetWindowCenter_44();
  public double[] GetWindowCenter()
  {
    return GetWindowCenter_44();
  }

  private native void SetObliqueAngles_45(double id0,double id1);
  public void SetObliqueAngles(double id0,double id1)
  {
    SetObliqueAngles_45(id0,id1);
  }

  private native void ApplyTransform_46(vtkTransform id0);
  public void ApplyTransform(vtkTransform id0)
  {
    ApplyTransform_46(id0);
  }

  private native double[] GetViewPlaneNormal_47();
  public double[] GetViewPlaneNormal()
  {
    return GetViewPlaneNormal_47();
  }

  private native void SetViewShear_48(double id0,double id1,double id2);
  public void SetViewShear(double id0,double id1,double id2)
  {
    SetViewShear_48(id0,id1,id2);
  }

  private native void SetViewShear_49(double id0[]);
  public void SetViewShear(double id0[])
  {
    SetViewShear_49(id0);
  }

  private native double[] GetViewShear_50();
  public double[] GetViewShear()
  {
    return GetViewShear_50();
  }

  private native void SetEyeAngle_51(double id0);
  public void SetEyeAngle(double id0)
  {
    SetEyeAngle_51(id0);
  }

  private native double GetEyeAngle_52();
  public double GetEyeAngle()
  {
    return GetEyeAngle_52();
  }

  private native void SetFocalDisk_53(double id0);
  public void SetFocalDisk(double id0)
  {
    SetFocalDisk_53(id0);
  }

  private native double GetFocalDisk_54();
  public double GetFocalDisk()
  {
    return GetFocalDisk_54();
  }

  private native void SetFocalDistance_55(double id0);
  public void SetFocalDistance(double id0)
  {
    SetFocalDistance_55(id0);
  }

  private native double GetFocalDistance_56();
  public double GetFocalDistance()
  {
    return GetFocalDistance_56();
  }

  private native void SetUseOffAxisProjection_57(int id0);
  public void SetUseOffAxisProjection(int id0)
  {
    SetUseOffAxisProjection_57(id0);
  }

  private native int GetUseOffAxisProjection_58();
  public int GetUseOffAxisProjection()
  {
    return GetUseOffAxisProjection_58();
  }

  private native void UseOffAxisProjectionOn_59();
  public void UseOffAxisProjectionOn()
  {
    UseOffAxisProjectionOn_59();
  }

  private native void UseOffAxisProjectionOff_60();
  public void UseOffAxisProjectionOff()
  {
    UseOffAxisProjectionOff_60();
  }

  private native double GetOffAxisClippingAdjustment_61();
  public double GetOffAxisClippingAdjustment()
  {
    return GetOffAxisClippingAdjustment_61();
  }

  private native void SetScreenBottomLeft_62(double id0,double id1,double id2);
  public void SetScreenBottomLeft(double id0,double id1,double id2)
  {
    SetScreenBottomLeft_62(id0,id1,id2);
  }

  private native void SetScreenBottomLeft_63(double id0[]);
  public void SetScreenBottomLeft(double id0[])
  {
    SetScreenBottomLeft_63(id0);
  }

  private native double[] GetScreenBottomLeft_64();
  public double[] GetScreenBottomLeft()
  {
    return GetScreenBottomLeft_64();
  }

  private native void SetScreenBottomRight_65(double id0,double id1,double id2);
  public void SetScreenBottomRight(double id0,double id1,double id2)
  {
    SetScreenBottomRight_65(id0,id1,id2);
  }

  private native void SetScreenBottomRight_66(double id0[]);
  public void SetScreenBottomRight(double id0[])
  {
    SetScreenBottomRight_66(id0);
  }

  private native double[] GetScreenBottomRight_67();
  public double[] GetScreenBottomRight()
  {
    return GetScreenBottomRight_67();
  }

  private native void SetScreenTopRight_68(double id0,double id1,double id2);
  public void SetScreenTopRight(double id0,double id1,double id2)
  {
    SetScreenTopRight_68(id0,id1,id2);
  }

  private native void SetScreenTopRight_69(double id0[]);
  public void SetScreenTopRight(double id0[])
  {
    SetScreenTopRight_69(id0);
  }

  private native double[] GetScreenTopRight_70();
  public double[] GetScreenTopRight()
  {
    return GetScreenTopRight_70();
  }

  private native void SetEyeSeparation_71(double id0);
  public void SetEyeSeparation(double id0)
  {
    SetEyeSeparation_71(id0);
  }

  private native double GetEyeSeparation_72();
  public double GetEyeSeparation()
  {
    return GetEyeSeparation_72();
  }

  private native void SetEyePosition_73(double id0[]);
  public void SetEyePosition(double id0[])
  {
    SetEyePosition_73(id0);
  }

  private native void GetEyePosition_74(double id0[]);
  public void GetEyePosition(double id0[])
  {
    GetEyePosition_74(id0);
  }

  private native void GetEyePlaneNormal_75(double id0[]);
  public void GetEyePlaneNormal(double id0[])
  {
    GetEyePlaneNormal_75(id0);
  }

  private native void SetEyeTransformMatrix_76(vtkMatrix4x4 id0);
  public void SetEyeTransformMatrix(vtkMatrix4x4 id0)
  {
    SetEyeTransformMatrix_76(id0);
  }

  private native void SetEyeTransformMatrix_77(double id0[]);
  public void SetEyeTransformMatrix(double id0[])
  {
    SetEyeTransformMatrix_77(id0);
  }

  private native long GetEyeTransformMatrix_78();
  public vtkMatrix4x4 GetEyeTransformMatrix()
  {
    long temp = GetEyeTransformMatrix_78();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetModelTransformMatrix_79(vtkMatrix4x4 id0);
  public void SetModelTransformMatrix(vtkMatrix4x4 id0)
  {
    SetModelTransformMatrix_79(id0);
  }

  private native void SetModelTransformMatrix_80(double id0[]);
  public void SetModelTransformMatrix(double id0[])
  {
    SetModelTransformMatrix_80(id0);
  }

  private native long GetModelTransformMatrix_81();
  public vtkMatrix4x4 GetModelTransformMatrix()
  {
    long temp = GetModelTransformMatrix_81();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetModelViewTransformMatrix_82();
  public vtkMatrix4x4 GetModelViewTransformMatrix()
  {
    long temp = GetModelViewTransformMatrix_82();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetModelViewTransformObject_83();
  public vtkTransform GetModelViewTransformObject()
  {
    long temp = GetModelViewTransformObject_83();

    if (temp == 0) return null;
    return (vtkTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetViewTransformMatrix_84();
  public vtkMatrix4x4 GetViewTransformMatrix()
  {
    long temp = GetViewTransformMatrix_84();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetViewTransformObject_85();
  public vtkTransform GetViewTransformObject()
  {
    long temp = GetViewTransformObject_85();

    if (temp == 0) return null;
    return (vtkTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetExplicitProjectionTransformMatrix_86(vtkMatrix4x4 id0);
  public void SetExplicitProjectionTransformMatrix(vtkMatrix4x4 id0)
  {
    SetExplicitProjectionTransformMatrix_86(id0);
  }

  private native long GetExplicitProjectionTransformMatrix_87();
  public vtkMatrix4x4 GetExplicitProjectionTransformMatrix()
  {
    long temp = GetExplicitProjectionTransformMatrix_87();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUseExplicitProjectionTransformMatrix_88(boolean id0);
  public void SetUseExplicitProjectionTransformMatrix(boolean id0)
  {
    SetUseExplicitProjectionTransformMatrix_88(id0);
  }

  private native boolean GetUseExplicitProjectionTransformMatrix_89();
  public boolean GetUseExplicitProjectionTransformMatrix()
  {
    return GetUseExplicitProjectionTransformMatrix_89();
  }

  private native void UseExplicitProjectionTransformMatrixOn_90();
  public void UseExplicitProjectionTransformMatrixOn()
  {
    UseExplicitProjectionTransformMatrixOn_90();
  }

  private native void UseExplicitProjectionTransformMatrixOff_91();
  public void UseExplicitProjectionTransformMatrixOff()
  {
    UseExplicitProjectionTransformMatrixOff_91();
  }

  private native void SetExplicitAspectRatio_92(double id0);
  public void SetExplicitAspectRatio(double id0)
  {
    SetExplicitAspectRatio_92(id0);
  }

  private native double GetExplicitAspectRatio_93();
  public double GetExplicitAspectRatio()
  {
    return GetExplicitAspectRatio_93();
  }

  private native void SetUseExplicitAspectRatio_94(boolean id0);
  public void SetUseExplicitAspectRatio(boolean id0)
  {
    SetUseExplicitAspectRatio_94(id0);
  }

  private native boolean GetUseExplicitAspectRatio_95();
  public boolean GetUseExplicitAspectRatio()
  {
    return GetUseExplicitAspectRatio_95();
  }

  private native void UseExplicitAspectRatioOn_96();
  public void UseExplicitAspectRatioOn()
  {
    UseExplicitAspectRatioOn_96();
  }

  private native void UseExplicitAspectRatioOff_97();
  public void UseExplicitAspectRatioOff()
  {
    UseExplicitAspectRatioOff_97();
  }

  private native long GetProjectionTransformMatrix_98(double id0,double id1,double id2);
  public vtkMatrix4x4 GetProjectionTransformMatrix(double id0,double id1,double id2)
  {
    long temp = GetProjectionTransformMatrix_98(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetProjectionTransformObject_99(double id0,double id1,double id2);
  public vtkPerspectiveTransform GetProjectionTransformObject(double id0,double id1,double id2)
  {
    long temp = GetProjectionTransformObject_99(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkPerspectiveTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCompositeProjectionTransformMatrix_100(double id0,double id1,double id2);
  public vtkMatrix4x4 GetCompositeProjectionTransformMatrix(double id0,double id1,double id2)
  {
    long temp = GetCompositeProjectionTransformMatrix_100(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetProjectionTransformMatrix_101(vtkRenderer id0);
  public vtkMatrix4x4 GetProjectionTransformMatrix(vtkRenderer id0)
  {
    long temp = GetProjectionTransformMatrix_101(id0);

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUserViewTransform_102(vtkHomogeneousTransform id0);
  public void SetUserViewTransform(vtkHomogeneousTransform id0)
  {
    SetUserViewTransform_102(id0);
  }

  private native long GetUserViewTransform_103();
  public vtkHomogeneousTransform GetUserViewTransform()
  {
    long temp = GetUserViewTransform_103();

    if (temp == 0) return null;
    return (vtkHomogeneousTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUserTransform_104(vtkHomogeneousTransform id0);
  public void SetUserTransform(vtkHomogeneousTransform id0)
  {
    SetUserTransform_104(id0);
  }

  private native long GetUserTransform_105();
  public vtkHomogeneousTransform GetUserTransform()
  {
    long temp = GetUserTransform_105();

    if (temp == 0) return null;
    return (vtkHomogeneousTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Render_106(vtkRenderer id0);
  public void Render(vtkRenderer id0)
  {
    Render_106(id0);
  }

  private native long GetViewingRaysMTime_107();
  public long GetViewingRaysMTime()
  {
    return GetViewingRaysMTime_107();
  }

  private native void ViewingRaysModified_108();
  public void ViewingRaysModified()
  {
    ViewingRaysModified_108();
  }

  private native void GetFrustumPlanes_109(double id0,double id1[]);
  public void GetFrustumPlanes(double id0,double id1[])
  {
    GetFrustumPlanes_109(id0,id1);
  }

  private native void UpdateIdealShiftScale_110(double id0);
  public void UpdateIdealShiftScale(double id0)
  {
    UpdateIdealShiftScale_110(id0);
  }

  private native double[] GetFocalPointShift_111();
  public double[] GetFocalPointShift()
  {
    return GetFocalPointShift_111();
  }

  private native double GetFocalPointScale_112();
  public double GetFocalPointScale()
  {
    return GetFocalPointScale_112();
  }

  private native double[] GetNearPlaneShift_113();
  public double[] GetNearPlaneShift()
  {
    return GetNearPlaneShift_113();
  }

  private native double GetNearPlaneScale_114();
  public double GetNearPlaneScale()
  {
    return GetNearPlaneScale_114();
  }

  private native void SetShiftScaleThreshold_115(double id0);
  public void SetShiftScaleThreshold(double id0)
  {
    SetShiftScaleThreshold_115(id0);
  }

  private native double GetShiftScaleThreshold_116();
  public double GetShiftScaleThreshold()
  {
    return GetShiftScaleThreshold_116();
  }

  private native double[] GetOrientation_117();
  public double[] GetOrientation()
  {
    return GetOrientation_117();
  }

  private native double[] GetOrientationWXYZ_118();
  public double[] GetOrientationWXYZ()
  {
    return GetOrientationWXYZ_118();
  }

  private native void ComputeViewPlaneNormal_119();
  public void ComputeViewPlaneNormal()
  {
    ComputeViewPlaneNormal_119();
  }

  private native long GetCameraLightTransformMatrix_120();
  public vtkMatrix4x4 GetCameraLightTransformMatrix()
  {
    long temp = GetCameraLightTransformMatrix_120();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void UpdateViewport_121(vtkRenderer id0);
  public void UpdateViewport(vtkRenderer id0)
  {
    UpdateViewport_121(id0);
  }

  private native int GetStereo_122();
  public int GetStereo()
  {
    return GetStereo_122();
  }

  private native void SetLeftEye_123(int id0);
  public void SetLeftEye(int id0)
  {
    SetLeftEye_123(id0);
  }

  private native int GetLeftEye_124();
  public int GetLeftEye()
  {
    return GetLeftEye_124();
  }

  private native void ShallowCopy_125(vtkCamera id0);
  public void ShallowCopy(vtkCamera id0)
  {
    ShallowCopy_125(id0);
  }

  private native void DeepCopy_126(vtkCamera id0);
  public void DeepCopy(vtkCamera id0)
  {
    DeepCopy_126(id0);
  }

  private native void SetFreezeFocalPoint_127(boolean id0);
  public void SetFreezeFocalPoint(boolean id0)
  {
    SetFreezeFocalPoint_127(id0);
  }

  private native boolean GetFreezeFocalPoint_128();
  public boolean GetFreezeFocalPoint()
  {
    return GetFreezeFocalPoint_128();
  }

  private native void SetUseScissor_129(boolean id0);
  public void SetUseScissor(boolean id0)
  {
    SetUseScissor_129(id0);
  }

  private native boolean GetUseScissor_130();
  public boolean GetUseScissor()
  {
    return GetUseScissor_130();
  }

  private native long GetInformation_131();
  public vtkInformation GetInformation()
  {
    long temp = GetInformation_131();

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInformation_132(vtkInformation id0);
  public void SetInformation(vtkInformation id0)
  {
    SetInformation_132(id0);
  }

  public vtkCamera() { super(); }

  public vtkCamera(long id) { super(id); }
  public native long   VTKInit();

}
