// java wrapper for vtkSmartVolumeMapper object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkSmartVolumeMapper extends vtkVolumeMapper
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

  private native void SetFinalColorWindow_4(float id0);
  public void SetFinalColorWindow(float id0)
  {
    SetFinalColorWindow_4(id0);
  }

  private native float GetFinalColorWindow_5();
  public float GetFinalColorWindow()
  {
    return GetFinalColorWindow_5();
  }

  private native void SetFinalColorLevel_6(float id0);
  public void SetFinalColorLevel(float id0)
  {
    SetFinalColorLevel_6(id0);
  }

  private native float GetFinalColorLevel_7();
  public float GetFinalColorLevel()
  {
    return GetFinalColorLevel_7();
  }

  private native void SetRequestedRenderMode_8(int id0);
  public void SetRequestedRenderMode(int id0)
  {
    SetRequestedRenderMode_8(id0);
  }

  private native void SetRequestedRenderModeToDefault_9();
  public void SetRequestedRenderModeToDefault()
  {
    SetRequestedRenderModeToDefault_9();
  }

  private native void SetRequestedRenderModeToRayCast_10();
  public void SetRequestedRenderModeToRayCast()
  {
    SetRequestedRenderModeToRayCast_10();
  }

  private native void SetRequestedRenderModeToGPU_11();
  public void SetRequestedRenderModeToGPU()
  {
    SetRequestedRenderModeToGPU_11();
  }

  private native void SetRequestedRenderModeToOSPRay_12();
  public void SetRequestedRenderModeToOSPRay()
  {
    SetRequestedRenderModeToOSPRay_12();
  }

  private native int GetRequestedRenderMode_13();
  public int GetRequestedRenderMode()
  {
    return GetRequestedRenderMode_13();
  }

  private native int GetLastUsedRenderMode_14();
  public int GetLastUsedRenderMode()
  {
    return GetLastUsedRenderMode_14();
  }

  private native void SetMaxMemoryInBytes_15(long id0);
  public void SetMaxMemoryInBytes(long id0)
  {
    SetMaxMemoryInBytes_15(id0);
  }

  private native long GetMaxMemoryInBytes_16();
  public long GetMaxMemoryInBytes()
  {
    return GetMaxMemoryInBytes_16();
  }

  private native void SetMaxMemoryFraction_17(float id0);
  public void SetMaxMemoryFraction(float id0)
  {
    SetMaxMemoryFraction_17(id0);
  }

  private native float GetMaxMemoryFractionMinValue_18();
  public float GetMaxMemoryFractionMinValue()
  {
    return GetMaxMemoryFractionMinValue_18();
  }

  private native float GetMaxMemoryFractionMaxValue_19();
  public float GetMaxMemoryFractionMaxValue()
  {
    return GetMaxMemoryFractionMaxValue_19();
  }

  private native float GetMaxMemoryFraction_20();
  public float GetMaxMemoryFraction()
  {
    return GetMaxMemoryFraction_20();
  }

  private native void SetInterpolationMode_21(int id0);
  public void SetInterpolationMode(int id0)
  {
    SetInterpolationMode_21(id0);
  }

  private native int GetInterpolationModeMinValue_22();
  public int GetInterpolationModeMinValue()
  {
    return GetInterpolationModeMinValue_22();
  }

  private native int GetInterpolationModeMaxValue_23();
  public int GetInterpolationModeMaxValue()
  {
    return GetInterpolationModeMaxValue_23();
  }

  private native int GetInterpolationMode_24();
  public int GetInterpolationMode()
  {
    return GetInterpolationMode_24();
  }

  private native void SetInterpolationModeToNearestNeighbor_25();
  public void SetInterpolationModeToNearestNeighbor()
  {
    SetInterpolationModeToNearestNeighbor_25();
  }

  private native void SetInterpolationModeToLinear_26();
  public void SetInterpolationModeToLinear()
  {
    SetInterpolationModeToLinear_26();
  }

  private native void SetInterpolationModeToCubic_27();
  public void SetInterpolationModeToCubic()
  {
    SetInterpolationModeToCubic_27();
  }

  private native void CreateCanonicalView_28(vtkRenderer id0,vtkVolume id1,vtkVolume id2,vtkImageData id3,int id4,double id5[],double id6[]);
  public void CreateCanonicalView(vtkRenderer id0,vtkVolume id1,vtkVolume id2,vtkImageData id3,int id4,double id5[],double id6[])
  {
    CreateCanonicalView_28(id0,id1,id2,id3,id4,id5,id6);
  }

  private native void SetUseJittering_29(int id0);
  public void SetUseJittering(int id0)
  {
    SetUseJittering_29(id0);
  }

  private native int GetUseJitteringMinValue_30();
  public int GetUseJitteringMinValue()
  {
    return GetUseJitteringMinValue_30();
  }

  private native int GetUseJitteringMaxValue_31();
  public int GetUseJitteringMaxValue()
  {
    return GetUseJitteringMaxValue_31();
  }

  private native int GetUseJittering_32();
  public int GetUseJittering()
  {
    return GetUseJittering_32();
  }

  private native void UseJitteringOn_33();
  public void UseJitteringOn()
  {
    UseJitteringOn_33();
  }

  private native void UseJitteringOff_34();
  public void UseJitteringOff()
  {
    UseJitteringOff_34();
  }

  private native void SetInteractiveUpdateRate_35(double id0);
  public void SetInteractiveUpdateRate(double id0)
  {
    SetInteractiveUpdateRate_35(id0);
  }

  private native double GetInteractiveUpdateRateMinValue_36();
  public double GetInteractiveUpdateRateMinValue()
  {
    return GetInteractiveUpdateRateMinValue_36();
  }

  private native double GetInteractiveUpdateRateMaxValue_37();
  public double GetInteractiveUpdateRateMaxValue()
  {
    return GetInteractiveUpdateRateMaxValue_37();
  }

  private native double GetInteractiveUpdateRate_38();
  public double GetInteractiveUpdateRate()
  {
    return GetInteractiveUpdateRate_38();
  }

  private native void SetInteractiveAdjustSampleDistances_39(int id0);
  public void SetInteractiveAdjustSampleDistances(int id0)
  {
    SetInteractiveAdjustSampleDistances_39(id0);
  }

  private native int GetInteractiveAdjustSampleDistancesMinValue_40();
  public int GetInteractiveAdjustSampleDistancesMinValue()
  {
    return GetInteractiveAdjustSampleDistancesMinValue_40();
  }

  private native int GetInteractiveAdjustSampleDistancesMaxValue_41();
  public int GetInteractiveAdjustSampleDistancesMaxValue()
  {
    return GetInteractiveAdjustSampleDistancesMaxValue_41();
  }

  private native int GetInteractiveAdjustSampleDistances_42();
  public int GetInteractiveAdjustSampleDistances()
  {
    return GetInteractiveAdjustSampleDistances_42();
  }

  private native void InteractiveAdjustSampleDistancesOn_43();
  public void InteractiveAdjustSampleDistancesOn()
  {
    InteractiveAdjustSampleDistancesOn_43();
  }

  private native void InteractiveAdjustSampleDistancesOff_44();
  public void InteractiveAdjustSampleDistancesOff()
  {
    InteractiveAdjustSampleDistancesOff_44();
  }

  private native void SetAutoAdjustSampleDistances_45(int id0);
  public void SetAutoAdjustSampleDistances(int id0)
  {
    SetAutoAdjustSampleDistances_45(id0);
  }

  private native int GetAutoAdjustSampleDistancesMinValue_46();
  public int GetAutoAdjustSampleDistancesMinValue()
  {
    return GetAutoAdjustSampleDistancesMinValue_46();
  }

  private native int GetAutoAdjustSampleDistancesMaxValue_47();
  public int GetAutoAdjustSampleDistancesMaxValue()
  {
    return GetAutoAdjustSampleDistancesMaxValue_47();
  }

  private native int GetAutoAdjustSampleDistances_48();
  public int GetAutoAdjustSampleDistances()
  {
    return GetAutoAdjustSampleDistances_48();
  }

  private native void AutoAdjustSampleDistancesOn_49();
  public void AutoAdjustSampleDistancesOn()
  {
    AutoAdjustSampleDistancesOn_49();
  }

  private native void AutoAdjustSampleDistancesOff_50();
  public void AutoAdjustSampleDistancesOff()
  {
    AutoAdjustSampleDistancesOff_50();
  }

  private native void SetSampleDistance_51(float id0);
  public void SetSampleDistance(float id0)
  {
    SetSampleDistance_51(id0);
  }

  private native float GetSampleDistance_52();
  public float GetSampleDistance()
  {
    return GetSampleDistance_52();
  }

  private native void SetGlobalIlluminationReach_53(float id0);
  public void SetGlobalIlluminationReach(float id0)
  {
    SetGlobalIlluminationReach_53(id0);
  }

  private native float GetGlobalIlluminationReachMinValue_54();
  public float GetGlobalIlluminationReachMinValue()
  {
    return GetGlobalIlluminationReachMinValue_54();
  }

  private native float GetGlobalIlluminationReachMaxValue_55();
  public float GetGlobalIlluminationReachMaxValue()
  {
    return GetGlobalIlluminationReachMaxValue_55();
  }

  private native float GetGlobalIlluminationReach_56();
  public float GetGlobalIlluminationReach()
  {
    return GetGlobalIlluminationReach_56();
  }

  private native void SetVolumetricScatteringBlending_57(float id0);
  public void SetVolumetricScatteringBlending(float id0)
  {
    SetVolumetricScatteringBlending_57(id0);
  }

  private native float GetVolumetricScatteringBlendingMinValue_58();
  public float GetVolumetricScatteringBlendingMinValue()
  {
    return GetVolumetricScatteringBlendingMinValue_58();
  }

  private native float GetVolumetricScatteringBlendingMaxValue_59();
  public float GetVolumetricScatteringBlendingMaxValue()
  {
    return GetVolumetricScatteringBlendingMaxValue_59();
  }

  private native float GetVolumetricScatteringBlending_60();
  public float GetVolumetricScatteringBlending()
  {
    return GetVolumetricScatteringBlending_60();
  }

  private native void Render_61(vtkRenderer id0,vtkVolume id1);
  public void Render(vtkRenderer id0,vtkVolume id1)
  {
    Render_61(id0,id1);
  }

  private native void ReleaseGraphicsResources_62(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_62(id0);
  }

  private native void SetVectorMode_63(int id0);
  public void SetVectorMode(int id0)
  {
    SetVectorMode_63(id0);
  }

  private native int GetVectorMode_64();
  public int GetVectorMode()
  {
    return GetVectorMode_64();
  }

  private native void SetVectorComponent_65(int id0);
  public void SetVectorComponent(int id0)
  {
    SetVectorComponent_65(id0);
  }

  private native int GetVectorComponentMinValue_66();
  public int GetVectorComponentMinValue()
  {
    return GetVectorComponentMinValue_66();
  }

  private native int GetVectorComponentMaxValue_67();
  public int GetVectorComponentMaxValue()
  {
    return GetVectorComponentMaxValue_67();
  }

  private native int GetVectorComponent_68();
  public int GetVectorComponent()
  {
    return GetVectorComponent_68();
  }

  private native void SetTransfer2DYAxisArray_69(byte[] id0, int len0);
  public void SetTransfer2DYAxisArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTransfer2DYAxisArray_69(bytes0, bytes0.length);
  }

  private native byte[] GetTransfer2DYAxisArray_70();
  public String GetTransfer2DYAxisArray()
  {
    return new String(GetTransfer2DYAxisArray_70(), StandardCharsets.UTF_8);
  }

  private native void SetLowResMode_71(int id0);
  public void SetLowResMode(int id0)
  {
    SetLowResMode_71(id0);
  }

  private native int GetLowResMode_72();
  public int GetLowResMode()
  {
    return GetLowResMode_72();
  }

  public vtkSmartVolumeMapper() { super(); }

  public vtkSmartVolumeMapper(long id) { super(id); }
  public native long   VTKInit();

}
