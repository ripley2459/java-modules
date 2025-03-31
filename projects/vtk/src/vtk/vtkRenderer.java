// java wrapper for vtkRenderer object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkRenderer extends vtkViewport
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

  private native void AddActor_4(vtkProp id0);
  public void AddActor(vtkProp id0)
  {
    AddActor_4(id0);
  }

  private native void AddVolume_5(vtkProp id0);
  public void AddVolume(vtkProp id0)
  {
    AddVolume_5(id0);
  }

  private native void RemoveActor_6(vtkProp id0);
  public void RemoveActor(vtkProp id0)
  {
    RemoveActor_6(id0);
  }

  private native void RemoveVolume_7(vtkProp id0);
  public void RemoveVolume(vtkProp id0)
  {
    RemoveVolume_7(id0);
  }

  private native void AddLight_8(vtkLight id0);
  public void AddLight(vtkLight id0)
  {
    AddLight_8(id0);
  }

  private native void RemoveLight_9(vtkLight id0);
  public void RemoveLight(vtkLight id0)
  {
    RemoveLight_9(id0);
  }

  private native void RemoveAllLights_10();
  public void RemoveAllLights()
  {
    RemoveAllLights_10();
  }

  private native long GetLights_11();
  public vtkLightCollection GetLights()
  {
    long temp = GetLights_11();

    if (temp == 0) return null;
    return (vtkLightCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLightCollection_12(vtkLightCollection id0);
  public void SetLightCollection(vtkLightCollection id0)
  {
    SetLightCollection_12(id0);
  }

  private native void CreateLight_13();
  public void CreateLight()
  {
    CreateLight_13();
  }

  private native long MakeLight_14();
  public vtkLight MakeLight()
  {
    long temp = MakeLight_14();

    if (temp == 0) return null;
    return (vtkLight)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetTwoSidedLighting_15();
  public int GetTwoSidedLighting()
  {
    return GetTwoSidedLighting_15();
  }

  private native void SetTwoSidedLighting_16(int id0);
  public void SetTwoSidedLighting(int id0)
  {
    SetTwoSidedLighting_16(id0);
  }

  private native void TwoSidedLightingOn_17();
  public void TwoSidedLightingOn()
  {
    TwoSidedLightingOn_17();
  }

  private native void TwoSidedLightingOff_18();
  public void TwoSidedLightingOff()
  {
    TwoSidedLightingOff_18();
  }

  private native void SetLightFollowCamera_19(int id0);
  public void SetLightFollowCamera(int id0)
  {
    SetLightFollowCamera_19(id0);
  }

  private native int GetLightFollowCamera_20();
  public int GetLightFollowCamera()
  {
    return GetLightFollowCamera_20();
  }

  private native void LightFollowCameraOn_21();
  public void LightFollowCameraOn()
  {
    LightFollowCameraOn_21();
  }

  private native void LightFollowCameraOff_22();
  public void LightFollowCameraOff()
  {
    LightFollowCameraOff_22();
  }

  private native int GetAutomaticLightCreation_23();
  public int GetAutomaticLightCreation()
  {
    return GetAutomaticLightCreation_23();
  }

  private native void SetAutomaticLightCreation_24(int id0);
  public void SetAutomaticLightCreation(int id0)
  {
    SetAutomaticLightCreation_24(id0);
  }

  private native void AutomaticLightCreationOn_25();
  public void AutomaticLightCreationOn()
  {
    AutomaticLightCreationOn_25();
  }

  private native void AutomaticLightCreationOff_26();
  public void AutomaticLightCreationOff()
  {
    AutomaticLightCreationOff_26();
  }

  private native int UpdateLightsGeometryToFollowCamera_27();
  public int UpdateLightsGeometryToFollowCamera()
  {
    return UpdateLightsGeometryToFollowCamera_27();
  }

  private native long GetVolumes_28();
  public vtkVolumeCollection GetVolumes()
  {
    long temp = GetVolumes_28();

    if (temp == 0) return null;
    return (vtkVolumeCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetActors_29();
  public vtkActorCollection GetActors()
  {
    long temp = GetActors_29();

    if (temp == 0) return null;
    return (vtkActorCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetActiveCamera_30(vtkCamera id0);
  public void SetActiveCamera(vtkCamera id0)
  {
    SetActiveCamera_30(id0);
  }

  private native long GetActiveCamera_31();
  public vtkCamera GetActiveCamera()
  {
    long temp = GetActiveCamera_31();

    if (temp == 0) return null;
    return (vtkCamera)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long MakeCamera_32();
  public vtkCamera MakeCamera()
  {
    long temp = MakeCamera_32();

    if (temp == 0) return null;
    return (vtkCamera)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetErase_33(int id0);
  public void SetErase(int id0)
  {
    SetErase_33(id0);
  }

  private native int GetErase_34();
  public int GetErase()
  {
    return GetErase_34();
  }

  private native void EraseOn_35();
  public void EraseOn()
  {
    EraseOn_35();
  }

  private native void EraseOff_36();
  public void EraseOff()
  {
    EraseOff_36();
  }

  private native void SetDraw_37(int id0);
  public void SetDraw(int id0)
  {
    SetDraw_37(id0);
  }

  private native int GetDraw_38();
  public int GetDraw()
  {
    return GetDraw_38();
  }

  private native void DrawOn_39();
  public void DrawOn()
  {
    DrawOn_39();
  }

  private native void DrawOff_40();
  public void DrawOff()
  {
    DrawOff_40();
  }

  private native int CaptureGL2PSSpecialProp_41(vtkProp id0);
  public int CaptureGL2PSSpecialProp(vtkProp id0)
  {
    return CaptureGL2PSSpecialProp_41(id0);
  }

  private native void SetGL2PSSpecialPropCollection_42(vtkPropCollection id0);
  public void SetGL2PSSpecialPropCollection(vtkPropCollection id0)
  {
    SetGL2PSSpecialPropCollection_42(id0);
  }

  private native void AddCuller_43(vtkCuller id0);
  public void AddCuller(vtkCuller id0)
  {
    AddCuller_43(id0);
  }

  private native void RemoveCuller_44(vtkCuller id0);
  public void RemoveCuller(vtkCuller id0)
  {
    RemoveCuller_44(id0);
  }

  private native long GetCullers_45();
  public vtkCullerCollection GetCullers()
  {
    long temp = GetCullers_45();

    if (temp == 0) return null;
    return (vtkCullerCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAmbient_46(double id0,double id1,double id2);
  public void SetAmbient(double id0,double id1,double id2)
  {
    SetAmbient_46(id0,id1,id2);
  }

  private native void SetAmbient_47(double id0[]);
  public void SetAmbient(double id0[])
  {
    SetAmbient_47(id0);
  }

  private native double[] GetAmbient_48();
  public double[] GetAmbient()
  {
    return GetAmbient_48();
  }

  private native void SetAllocatedRenderTime_49(double id0);
  public void SetAllocatedRenderTime(double id0)
  {
    SetAllocatedRenderTime_49(id0);
  }

  private native double GetAllocatedRenderTime_50();
  public double GetAllocatedRenderTime()
  {
    return GetAllocatedRenderTime_50();
  }

  private native double GetTimeFactor_51();
  public double GetTimeFactor()
  {
    return GetTimeFactor_51();
  }

  private native void Render_52();
  public void Render()
  {
    Render_52();
  }

  private native void DeviceRender_53();
  public void DeviceRender()
  {
    DeviceRender_53();
  }

  private native void DeviceRenderOpaqueGeometry_54(vtkFrameBufferObjectBase id0);
  public void DeviceRenderOpaqueGeometry(vtkFrameBufferObjectBase id0)
  {
    DeviceRenderOpaqueGeometry_54(id0);
  }

  private native void DeviceRenderTranslucentPolygonalGeometry_55(vtkFrameBufferObjectBase id0);
  public void DeviceRenderTranslucentPolygonalGeometry(vtkFrameBufferObjectBase id0)
  {
    DeviceRenderTranslucentPolygonalGeometry_55(id0);
  }

  private native void ClearLights_56();
  public void ClearLights()
  {
    ClearLights_56();
  }

  private native void Clear_57();
  public void Clear()
  {
    Clear_57();
  }

  private native int VisibleActorCount_58();
  public int VisibleActorCount()
  {
    return VisibleActorCount_58();
  }

  private native int VisibleVolumeCount_59();
  public int VisibleVolumeCount()
  {
    return VisibleVolumeCount_59();
  }

  private native void ComputeVisiblePropBounds_60(double id0[]);
  public void ComputeVisiblePropBounds(double id0[])
  {
    ComputeVisiblePropBounds_60(id0);
  }

  private native double[] ComputeVisiblePropBounds_61();
  public double[] ComputeVisiblePropBounds()
  {
    return ComputeVisiblePropBounds_61();
  }

  private native void ResetCameraClippingRange_62();
  public void ResetCameraClippingRange()
  {
    ResetCameraClippingRange_62();
  }

  private native void ResetCameraClippingRange_63(double id0[]);
  public void ResetCameraClippingRange(double id0[])
  {
    ResetCameraClippingRange_63(id0);
  }

  private native void ResetCameraClippingRange_64(double id0,double id1,double id2,double id3,double id4,double id5);
  public void ResetCameraClippingRange(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    ResetCameraClippingRange_64(id0,id1,id2,id3,id4,id5);
  }

  private native void SetNearClippingPlaneTolerance_65(double id0);
  public void SetNearClippingPlaneTolerance(double id0)
  {
    SetNearClippingPlaneTolerance_65(id0);
  }

  private native double GetNearClippingPlaneToleranceMinValue_66();
  public double GetNearClippingPlaneToleranceMinValue()
  {
    return GetNearClippingPlaneToleranceMinValue_66();
  }

  private native double GetNearClippingPlaneToleranceMaxValue_67();
  public double GetNearClippingPlaneToleranceMaxValue()
  {
    return GetNearClippingPlaneToleranceMaxValue_67();
  }

  private native double GetNearClippingPlaneTolerance_68();
  public double GetNearClippingPlaneTolerance()
  {
    return GetNearClippingPlaneTolerance_68();
  }

  private native void SetClippingRangeExpansion_69(double id0);
  public void SetClippingRangeExpansion(double id0)
  {
    SetClippingRangeExpansion_69(id0);
  }

  private native double GetClippingRangeExpansionMinValue_70();
  public double GetClippingRangeExpansionMinValue()
  {
    return GetClippingRangeExpansionMinValue_70();
  }

  private native double GetClippingRangeExpansionMaxValue_71();
  public double GetClippingRangeExpansionMaxValue()
  {
    return GetClippingRangeExpansionMaxValue_71();
  }

  private native double GetClippingRangeExpansion_72();
  public double GetClippingRangeExpansion()
  {
    return GetClippingRangeExpansion_72();
  }

  private native void ResetCamera_73();
  public void ResetCamera()
  {
    ResetCamera_73();
  }

  private native void ResetCamera_74(double id0[]);
  public void ResetCamera(double id0[])
  {
    ResetCamera_74(id0);
  }

  private native void ResetCamera_75(double id0,double id1,double id2,double id3,double id4,double id5);
  public void ResetCamera(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    ResetCamera_75(id0,id1,id2,id3,id4,id5);
  }

  private native void ResetCameraScreenSpace_76(double id0);
  public void ResetCameraScreenSpace(double id0)
  {
    ResetCameraScreenSpace_76(id0);
  }

  private native void ResetCameraScreenSpace_77(double id0[],double id1);
  public void ResetCameraScreenSpace(double id0[],double id1)
  {
    ResetCameraScreenSpace_77(id0,id1);
  }

  private native void ResetCameraScreenSpace_78(double id0,double id1,double id2,double id3,double id4,double id5,double id6);
  public void ResetCameraScreenSpace(double id0,double id1,double id2,double id3,double id4,double id5,double id6)
  {
    ResetCameraScreenSpace_78(id0,id1,id2,id3,id4,id5,id6);
  }

  private native void SetRenderWindow_79(vtkRenderWindow id0);
  public void SetRenderWindow(vtkRenderWindow id0)
  {
    SetRenderWindow_79(id0);
  }

  private native long GetRenderWindow_80();
  public vtkRenderWindow GetRenderWindow()
  {
    long temp = GetRenderWindow_80();

    if (temp == 0) return null;
    return (vtkRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetVTKWindow_81();
  public vtkWindow GetVTKWindow()
  {
    long temp = GetVTKWindow_81();

    if (temp == 0) return null;
    return (vtkWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBackingStore_82(int id0);
  public void SetBackingStore(int id0)
  {
    SetBackingStore_82(id0);
  }

  private native int GetBackingStore_83();
  public int GetBackingStore()
  {
    return GetBackingStore_83();
  }

  private native void BackingStoreOn_84();
  public void BackingStoreOn()
  {
    BackingStoreOn_84();
  }

  private native void BackingStoreOff_85();
  public void BackingStoreOff()
  {
    BackingStoreOff_85();
  }

  private native void SetInteractive_86(int id0);
  public void SetInteractive(int id0)
  {
    SetInteractive_86(id0);
  }

  private native int GetInteractive_87();
  public int GetInteractive()
  {
    return GetInteractive_87();
  }

  private native void InteractiveOn_88();
  public void InteractiveOn()
  {
    InteractiveOn_88();
  }

  private native void InteractiveOff_89();
  public void InteractiveOff()
  {
    InteractiveOff_89();
  }

  private native void SetLayer_90(int id0);
  public void SetLayer(int id0)
  {
    SetLayer_90(id0);
  }

  private native int GetLayer_91();
  public int GetLayer()
  {
    return GetLayer_91();
  }

  private native int GetPreserveColorBuffer_92();
  public int GetPreserveColorBuffer()
  {
    return GetPreserveColorBuffer_92();
  }

  private native void SetPreserveColorBuffer_93(int id0);
  public void SetPreserveColorBuffer(int id0)
  {
    SetPreserveColorBuffer_93(id0);
  }

  private native void PreserveColorBufferOn_94();
  public void PreserveColorBufferOn()
  {
    PreserveColorBufferOn_94();
  }

  private native void PreserveColorBufferOff_95();
  public void PreserveColorBufferOff()
  {
    PreserveColorBufferOff_95();
  }

  private native void SetPreserveDepthBuffer_96(int id0);
  public void SetPreserveDepthBuffer(int id0)
  {
    SetPreserveDepthBuffer_96(id0);
  }

  private native int GetPreserveDepthBuffer_97();
  public int GetPreserveDepthBuffer()
  {
    return GetPreserveDepthBuffer_97();
  }

  private native void PreserveDepthBufferOn_98();
  public void PreserveDepthBufferOn()
  {
    PreserveDepthBufferOn_98();
  }

  private native void PreserveDepthBufferOff_99();
  public void PreserveDepthBufferOff()
  {
    PreserveDepthBufferOff_99();
  }

  private native int Transparent_100();
  public int Transparent()
  {
    return Transparent_100();
  }

  private native void WorldToView_101();
  public void WorldToView()
  {
    WorldToView_101();
  }

  private native void ViewToWorld_102();
  public void ViewToWorld()
  {
    ViewToWorld_102();
  }

  private native double GetZ_103(int id0,int id1);
  public double GetZ(int id0,int id1)
  {
    return GetZ_103(id0,id1);
  }

  private native long GetMTime_104();
  public long GetMTime()
  {
    return GetMTime_104();
  }

  private native double GetLastRenderTimeInSeconds_105();
  public double GetLastRenderTimeInSeconds()
  {
    return GetLastRenderTimeInSeconds_105();
  }

  private native int GetNumberOfPropsRendered_106();
  public int GetNumberOfPropsRendered()
  {
    return GetNumberOfPropsRendered_106();
  }

  private native long PickProp_107(double id0,double id1);
  public vtkAssemblyPath PickProp(double id0,double id1)
  {
    long temp = PickProp_107(id0,id1);

    if (temp == 0) return null;
    return (vtkAssemblyPath)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long PickProp_108(double id0,double id1,double id2,double id3);
  public vtkAssemblyPath PickProp(double id0,double id1,double id2,double id3)
  {
    long temp = PickProp_108(id0,id1,id2,id3);

    if (temp == 0) return null;
    return (vtkAssemblyPath)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void StereoMidpoint_109();
  public void StereoMidpoint()
  {
    StereoMidpoint_109();
  }

  private native double GetTiledAspectRatio_110();
  public double GetTiledAspectRatio()
  {
    return GetTiledAspectRatio_110();
  }

  private native int IsActiveCameraCreated_111();
  public int IsActiveCameraCreated()
  {
    return IsActiveCameraCreated_111();
  }

  private native void SetUseDepthPeeling_112(int id0);
  public void SetUseDepthPeeling(int id0)
  {
    SetUseDepthPeeling_112(id0);
  }

  private native int GetUseDepthPeeling_113();
  public int GetUseDepthPeeling()
  {
    return GetUseDepthPeeling_113();
  }

  private native void UseDepthPeelingOn_114();
  public void UseDepthPeelingOn()
  {
    UseDepthPeelingOn_114();
  }

  private native void UseDepthPeelingOff_115();
  public void UseDepthPeelingOff()
  {
    UseDepthPeelingOff_115();
  }

  private native void SetUseDepthPeelingForVolumes_116(boolean id0);
  public void SetUseDepthPeelingForVolumes(boolean id0)
  {
    SetUseDepthPeelingForVolumes_116(id0);
  }

  private native boolean GetUseDepthPeelingForVolumes_117();
  public boolean GetUseDepthPeelingForVolumes()
  {
    return GetUseDepthPeelingForVolumes_117();
  }

  private native void UseDepthPeelingForVolumesOn_118();
  public void UseDepthPeelingForVolumesOn()
  {
    UseDepthPeelingForVolumesOn_118();
  }

  private native void UseDepthPeelingForVolumesOff_119();
  public void UseDepthPeelingForVolumesOff()
  {
    UseDepthPeelingForVolumesOff_119();
  }

  private native void SetOcclusionRatio_120(double id0);
  public void SetOcclusionRatio(double id0)
  {
    SetOcclusionRatio_120(id0);
  }

  private native double GetOcclusionRatioMinValue_121();
  public double GetOcclusionRatioMinValue()
  {
    return GetOcclusionRatioMinValue_121();
  }

  private native double GetOcclusionRatioMaxValue_122();
  public double GetOcclusionRatioMaxValue()
  {
    return GetOcclusionRatioMaxValue_122();
  }

  private native double GetOcclusionRatio_123();
  public double GetOcclusionRatio()
  {
    return GetOcclusionRatio_123();
  }

  private native void SetMaximumNumberOfPeels_124(int id0);
  public void SetMaximumNumberOfPeels(int id0)
  {
    SetMaximumNumberOfPeels_124(id0);
  }

  private native int GetMaximumNumberOfPeels_125();
  public int GetMaximumNumberOfPeels()
  {
    return GetMaximumNumberOfPeels_125();
  }

  private native int GetLastRenderingUsedDepthPeeling_126();
  public int GetLastRenderingUsedDepthPeeling()
  {
    return GetLastRenderingUsedDepthPeeling_126();
  }

  private native void SetUseSSAO_127(boolean id0);
  public void SetUseSSAO(boolean id0)
  {
    SetUseSSAO_127(id0);
  }

  private native boolean GetUseSSAO_128();
  public boolean GetUseSSAO()
  {
    return GetUseSSAO_128();
  }

  private native void UseSSAOOn_129();
  public void UseSSAOOn()
  {
    UseSSAOOn_129();
  }

  private native void UseSSAOOff_130();
  public void UseSSAOOff()
  {
    UseSSAOOff_130();
  }

  private native void SetSSAORadius_131(double id0);
  public void SetSSAORadius(double id0)
  {
    SetSSAORadius_131(id0);
  }

  private native double GetSSAORadius_132();
  public double GetSSAORadius()
  {
    return GetSSAORadius_132();
  }

  private native void SetSSAOBias_133(double id0);
  public void SetSSAOBias(double id0)
  {
    SetSSAOBias_133(id0);
  }

  private native double GetSSAOBias_134();
  public double GetSSAOBias()
  {
    return GetSSAOBias_134();
  }

  private native void SetSSAOKernelSize_135(int id0);
  public void SetSSAOKernelSize(int id0)
  {
    SetSSAOKernelSize_135(id0);
  }

  private native int GetSSAOKernelSize_136();
  public int GetSSAOKernelSize()
  {
    return GetSSAOKernelSize_136();
  }

  private native void SetSSAOBlur_137(boolean id0);
  public void SetSSAOBlur(boolean id0)
  {
    SetSSAOBlur_137(id0);
  }

  private native boolean GetSSAOBlur_138();
  public boolean GetSSAOBlur()
  {
    return GetSSAOBlur_138();
  }

  private native void SSAOBlurOn_139();
  public void SSAOBlurOn()
  {
    SSAOBlurOn_139();
  }

  private native void SSAOBlurOff_140();
  public void SSAOBlurOff()
  {
    SSAOBlurOff_140();
  }

  private native void SetDelegate_141(vtkRendererDelegate id0);
  public void SetDelegate(vtkRendererDelegate id0)
  {
    SetDelegate_141(id0);
  }

  private native long GetDelegate_142();
  public vtkRendererDelegate GetDelegate()
  {
    long temp = GetDelegate_142();

    if (temp == 0) return null;
    return (vtkRendererDelegate)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelector_143();
  public vtkHardwareSelector GetSelector()
  {
    long temp = GetSelector_143();

    if (temp == 0) return null;
    return (vtkHardwareSelector)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLeftBackgroundTexture_144(vtkTexture id0);
  public void SetLeftBackgroundTexture(vtkTexture id0)
  {
    SetLeftBackgroundTexture_144(id0);
  }

  private native long GetLeftBackgroundTexture_145();
  public vtkTexture GetLeftBackgroundTexture()
  {
    long temp = GetLeftBackgroundTexture_145();

    if (temp == 0) return null;
    return (vtkTexture)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBackgroundTexture_146(vtkTexture id0);
  public void SetBackgroundTexture(vtkTexture id0)
  {
    SetBackgroundTexture_146(id0);
  }

  private native long GetBackgroundTexture_147();
  public vtkTexture GetBackgroundTexture()
  {
    long temp = GetBackgroundTexture_147();

    if (temp == 0) return null;
    return (vtkTexture)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRightBackgroundTexture_148(vtkTexture id0);
  public void SetRightBackgroundTexture(vtkTexture id0)
  {
    SetRightBackgroundTexture_148(id0);
  }

  private native long GetRightBackgroundTexture_149();
  public vtkTexture GetRightBackgroundTexture()
  {
    long temp = GetRightBackgroundTexture_149();

    if (temp == 0) return null;
    return (vtkTexture)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTexturedBackground_150(boolean id0);
  public void SetTexturedBackground(boolean id0)
  {
    SetTexturedBackground_150(id0);
  }

  private native boolean GetTexturedBackground_151();
  public boolean GetTexturedBackground()
  {
    return GetTexturedBackground_151();
  }

  private native void TexturedBackgroundOn_152();
  public void TexturedBackgroundOn()
  {
    TexturedBackgroundOn_152();
  }

  private native void TexturedBackgroundOff_153();
  public void TexturedBackgroundOff()
  {
    TexturedBackgroundOff_153();
  }

  private native void ReleaseGraphicsResources_154(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_154(id0);
  }

  private native void SetUseFXAA_155(boolean id0);
  public void SetUseFXAA(boolean id0)
  {
    SetUseFXAA_155(id0);
  }

  private native boolean GetUseFXAA_156();
  public boolean GetUseFXAA()
  {
    return GetUseFXAA_156();
  }

  private native void UseFXAAOn_157();
  public void UseFXAAOn()
  {
    UseFXAAOn_157();
  }

  private native void UseFXAAOff_158();
  public void UseFXAAOff()
  {
    UseFXAAOff_158();
  }

  private native long GetFXAAOptions_159();
  public vtkFXAAOptions GetFXAAOptions()
  {
    long temp = GetFXAAOptions_159();

    if (temp == 0) return null;
    return (vtkFXAAOptions)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFXAAOptions_160(vtkFXAAOptions id0);
  public void SetFXAAOptions(vtkFXAAOptions id0)
  {
    SetFXAAOptions_160(id0);
  }

  private native void SetUseShadows_161(int id0);
  public void SetUseShadows(int id0)
  {
    SetUseShadows_161(id0);
  }

  private native int GetUseShadows_162();
  public int GetUseShadows()
  {
    return GetUseShadows_162();
  }

  private native void UseShadowsOn_163();
  public void UseShadowsOn()
  {
    UseShadowsOn_163();
  }

  private native void UseShadowsOff_164();
  public void UseShadowsOff()
  {
    UseShadowsOff_164();
  }

  private native void SetUseHiddenLineRemoval_165(int id0);
  public void SetUseHiddenLineRemoval(int id0)
  {
    SetUseHiddenLineRemoval_165(id0);
  }

  private native int GetUseHiddenLineRemoval_166();
  public int GetUseHiddenLineRemoval()
  {
    return GetUseHiddenLineRemoval_166();
  }

  private native void UseHiddenLineRemovalOn_167();
  public void UseHiddenLineRemovalOn()
  {
    UseHiddenLineRemovalOn_167();
  }

  private native void UseHiddenLineRemovalOff_168();
  public void UseHiddenLineRemovalOff()
  {
    UseHiddenLineRemovalOff_168();
  }

  private native void SetPass_169(vtkRenderPass id0);
  public void SetPass(vtkRenderPass id0)
  {
    SetPass_169(id0);
  }

  private native long GetPass_170();
  public vtkRenderPass GetPass()
  {
    long temp = GetPass_170();

    if (temp == 0) return null;
    return (vtkRenderPass)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInformation_171();
  public vtkInformation GetInformation()
  {
    long temp = GetInformation_171();

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInformation_172(vtkInformation id0);
  public void SetInformation(vtkInformation id0)
  {
    SetInformation_172(id0);
  }

  private native void SetUseImageBasedLighting_173(boolean id0);
  public void SetUseImageBasedLighting(boolean id0)
  {
    SetUseImageBasedLighting_173(id0);
  }

  private native boolean GetUseImageBasedLighting_174();
  public boolean GetUseImageBasedLighting()
  {
    return GetUseImageBasedLighting_174();
  }

  private native void UseImageBasedLightingOn_175();
  public void UseImageBasedLightingOn()
  {
    UseImageBasedLightingOn_175();
  }

  private native void UseImageBasedLightingOff_176();
  public void UseImageBasedLightingOff()
  {
    UseImageBasedLightingOff_176();
  }

  private native long GetEnvironmentTexture_177();
  public vtkTexture GetEnvironmentTexture()
  {
    long temp = GetEnvironmentTexture_177();

    if (temp == 0) return null;
    return (vtkTexture)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetEnvironmentTexture_178(vtkTexture id0,boolean id1);
  public void SetEnvironmentTexture(vtkTexture id0,boolean id1)
  {
    SetEnvironmentTexture_178(id0,id1);
  }

  private native double[] GetEnvironmentUp_179();
  public double[] GetEnvironmentUp()
  {
    return GetEnvironmentUp_179();
  }

  private native void SetEnvironmentUp_180(double id0,double id1,double id2);
  public void SetEnvironmentUp(double id0,double id1,double id2)
  {
    SetEnvironmentUp_180(id0,id1,id2);
  }

  private native void SetEnvironmentUp_181(double id0[]);
  public void SetEnvironmentUp(double id0[])
  {
    SetEnvironmentUp_181(id0);
  }

  private native double[] GetEnvironmentRight_182();
  public double[] GetEnvironmentRight()
  {
    return GetEnvironmentRight_182();
  }

  private native void SetEnvironmentRight_183(double id0,double id1,double id2);
  public void SetEnvironmentRight(double id0,double id1,double id2)
  {
    SetEnvironmentRight_183(id0,id1,id2);
  }

  private native void SetEnvironmentRight_184(double id0[]);
  public void SetEnvironmentRight(double id0[])
  {
    SetEnvironmentRight_184(id0);
  }

  private native void DisplayToWorld_185();
  public void DisplayToWorld()
  {
    DisplayToWorld_185();
  }

  public vtkRenderer() { super(); }

  public vtkRenderer(long id) { super(id); }
  public native long   VTKInit();

}
