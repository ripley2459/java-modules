// java wrapper for vtkRenderWindow object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkRenderWindow extends vtkWindow
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

  private native void AddRenderer_4(vtkRenderer id0);
  public void AddRenderer(vtkRenderer id0)
  {
    AddRenderer_4(id0);
  }

  private native void RemoveRenderer_5(vtkRenderer id0);
  public void RemoveRenderer(vtkRenderer id0)
  {
    RemoveRenderer_5(id0);
  }

  private native int HasRenderer_6(vtkRenderer id0);
  public int HasRenderer(vtkRenderer id0)
  {
    return HasRenderer_6(id0);
  }

  private native byte[] GetRenderLibrary_7();
  public String GetRenderLibrary()
  {
    return new String(GetRenderLibrary_7(), StandardCharsets.UTF_8);
  }

  private native byte[] GetRenderingBackend_8();
  public String GetRenderingBackend()
  {
    return new String(GetRenderingBackend_8(), StandardCharsets.UTF_8);
  }

  private native long GetRenderTimer_9();
  public vtkRenderTimerLog GetRenderTimer()
  {
    long temp = GetRenderTimer_9();

    if (temp == 0) return null;
    return (vtkRenderTimerLog)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRenderers_10();
  public vtkRendererCollection GetRenderers()
  {
    long temp = GetRenderers_10();

    if (temp == 0) return null;
    return (vtkRendererCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CaptureGL2PSSpecialProps_11(vtkCollection id0);
  public void CaptureGL2PSSpecialProps(vtkCollection id0)
  {
    CaptureGL2PSSpecialProps_11(id0);
  }

  private native int GetCapturingGL2PSSpecialProps_12();
  public int GetCapturingGL2PSSpecialProps()
  {
    return GetCapturingGL2PSSpecialProps_12();
  }

  private native void Render_13();
  public void Render()
  {
    Render_13();
  }

  private native void Start_14();
  public void Start()
  {
    Start_14();
  }

  private native void End_15();
  public void End()
  {
    End_15();
  }

  private native void Finalize_16();
  public void Finalize()
  {
    Finalize_16();
  }

  private native void Frame_17();
  public void Frame()
  {
    Frame_17();
  }

  private native void WaitForCompletion_18();
  public void WaitForCompletion()
  {
    WaitForCompletion_18();
  }

  private native void CopyResultFrame_19();
  public void CopyResultFrame()
  {
    CopyResultFrame_19();
  }

  private native long MakeRenderWindowInteractor_20();
  public vtkRenderWindowInteractor MakeRenderWindowInteractor()
  {
    long temp = MakeRenderWindowInteractor_20();

    if (temp == 0) return null;
    return (vtkRenderWindowInteractor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void HideCursor_21();
  public void HideCursor()
  {
    HideCursor_21();
  }

  private native void ShowCursor_22();
  public void ShowCursor()
  {
    ShowCursor_22();
  }

  private native void SetCursorPosition_23(int id0,int id1);
  public void SetCursorPosition(int id0,int id1)
  {
    SetCursorPosition_23(id0,id1);
  }

  private native void SetCurrentCursor_24(int id0);
  public void SetCurrentCursor(int id0)
  {
    SetCurrentCursor_24(id0);
  }

  private native int GetCurrentCursor_25();
  public int GetCurrentCursor()
  {
    return GetCurrentCursor_25();
  }

  private native void SetCursorFileName_26(byte[] id0, int len0);
  public void SetCursorFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCursorFileName_26(bytes0, bytes0.length);
  }

  private native byte[] GetCursorFileName_27();
  public String GetCursorFileName()
  {
    return new String(GetCursorFileName_27(), StandardCharsets.UTF_8);
  }

  private native void SetFullScreen_28(int id0);
  public void SetFullScreen(int id0)
  {
    SetFullScreen_28(id0);
  }

  private native int GetFullScreen_29();
  public int GetFullScreen()
  {
    return GetFullScreen_29();
  }

  private native void FullScreenOn_30();
  public void FullScreenOn()
  {
    FullScreenOn_30();
  }

  private native void FullScreenOff_31();
  public void FullScreenOff()
  {
    FullScreenOff_31();
  }

  private native void SetBorders_32(int id0);
  public void SetBorders(int id0)
  {
    SetBorders_32(id0);
  }

  private native int GetBorders_33();
  public int GetBorders()
  {
    return GetBorders_33();
  }

  private native void BordersOn_34();
  public void BordersOn()
  {
    BordersOn_34();
  }

  private native void BordersOff_35();
  public void BordersOff()
  {
    BordersOff_35();
  }

  private native int GetStereoCapableWindow_36();
  public int GetStereoCapableWindow()
  {
    return GetStereoCapableWindow_36();
  }

  private native void StereoCapableWindowOn_37();
  public void StereoCapableWindowOn()
  {
    StereoCapableWindowOn_37();
  }

  private native void StereoCapableWindowOff_38();
  public void StereoCapableWindowOff()
  {
    StereoCapableWindowOff_38();
  }

  private native void SetStereoCapableWindow_39(int id0);
  public void SetStereoCapableWindow(int id0)
  {
    SetStereoCapableWindow_39(id0);
  }

  private native int GetStereoRender_40();
  public int GetStereoRender()
  {
    return GetStereoRender_40();
  }

  private native void SetStereoRender_41(int id0);
  public void SetStereoRender(int id0)
  {
    SetStereoRender_41(id0);
  }

  private native void StereoRenderOn_42();
  public void StereoRenderOn()
  {
    StereoRenderOn_42();
  }

  private native void StereoRenderOff_43();
  public void StereoRenderOff()
  {
    StereoRenderOff_43();
  }

  private native void SetAlphaBitPlanes_44(int id0);
  public void SetAlphaBitPlanes(int id0)
  {
    SetAlphaBitPlanes_44(id0);
  }

  private native int GetAlphaBitPlanes_45();
  public int GetAlphaBitPlanes()
  {
    return GetAlphaBitPlanes_45();
  }

  private native void AlphaBitPlanesOn_46();
  public void AlphaBitPlanesOn()
  {
    AlphaBitPlanesOn_46();
  }

  private native void AlphaBitPlanesOff_47();
  public void AlphaBitPlanesOff()
  {
    AlphaBitPlanesOff_47();
  }

  private native void SetPointSmoothing_48(int id0);
  public void SetPointSmoothing(int id0)
  {
    SetPointSmoothing_48(id0);
  }

  private native int GetPointSmoothing_49();
  public int GetPointSmoothing()
  {
    return GetPointSmoothing_49();
  }

  private native void PointSmoothingOn_50();
  public void PointSmoothingOn()
  {
    PointSmoothingOn_50();
  }

  private native void PointSmoothingOff_51();
  public void PointSmoothingOff()
  {
    PointSmoothingOff_51();
  }

  private native void SetLineSmoothing_52(int id0);
  public void SetLineSmoothing(int id0)
  {
    SetLineSmoothing_52(id0);
  }

  private native int GetLineSmoothing_53();
  public int GetLineSmoothing()
  {
    return GetLineSmoothing_53();
  }

  private native void LineSmoothingOn_54();
  public void LineSmoothingOn()
  {
    LineSmoothingOn_54();
  }

  private native void LineSmoothingOff_55();
  public void LineSmoothingOff()
  {
    LineSmoothingOff_55();
  }

  private native void SetPolygonSmoothing_56(int id0);
  public void SetPolygonSmoothing(int id0)
  {
    SetPolygonSmoothing_56(id0);
  }

  private native int GetPolygonSmoothing_57();
  public int GetPolygonSmoothing()
  {
    return GetPolygonSmoothing_57();
  }

  private native void PolygonSmoothingOn_58();
  public void PolygonSmoothingOn()
  {
    PolygonSmoothingOn_58();
  }

  private native void PolygonSmoothingOff_59();
  public void PolygonSmoothingOff()
  {
    PolygonSmoothingOff_59();
  }

  private native int GetStereoType_60();
  public int GetStereoType()
  {
    return GetStereoType_60();
  }

  private native void SetStereoType_61(int id0);
  public void SetStereoType(int id0)
  {
    SetStereoType_61(id0);
  }

  private native void SetStereoTypeToCrystalEyes_62();
  public void SetStereoTypeToCrystalEyes()
  {
    SetStereoTypeToCrystalEyes_62();
  }

  private native void SetStereoTypeToRedBlue_63();
  public void SetStereoTypeToRedBlue()
  {
    SetStereoTypeToRedBlue_63();
  }

  private native void SetStereoTypeToInterlaced_64();
  public void SetStereoTypeToInterlaced()
  {
    SetStereoTypeToInterlaced_64();
  }

  private native void SetStereoTypeToLeft_65();
  public void SetStereoTypeToLeft()
  {
    SetStereoTypeToLeft_65();
  }

  private native void SetStereoTypeToRight_66();
  public void SetStereoTypeToRight()
  {
    SetStereoTypeToRight_66();
  }

  private native void SetStereoTypeToDresden_67();
  public void SetStereoTypeToDresden()
  {
    SetStereoTypeToDresden_67();
  }

  private native void SetStereoTypeToAnaglyph_68();
  public void SetStereoTypeToAnaglyph()
  {
    SetStereoTypeToAnaglyph_68();
  }

  private native void SetStereoTypeToCheckerboard_69();
  public void SetStereoTypeToCheckerboard()
  {
    SetStereoTypeToCheckerboard_69();
  }

  private native void SetStereoTypeToSplitViewportHorizontal_70();
  public void SetStereoTypeToSplitViewportHorizontal()
  {
    SetStereoTypeToSplitViewportHorizontal_70();
  }

  private native void SetStereoTypeToFake_71();
  public void SetStereoTypeToFake()
  {
    SetStereoTypeToFake_71();
  }

  private native void SetStereoTypeToEmulate_72();
  public void SetStereoTypeToEmulate()
  {
    SetStereoTypeToEmulate_72();
  }

  private native byte[] GetStereoTypeAsString_73();
  public String GetStereoTypeAsString()
  {
    return new String(GetStereoTypeAsString_73(), StandardCharsets.UTF_8);
  }

  private native byte[] GetStereoTypeAsString_74(int id0);
  public String GetStereoTypeAsString(int id0)
  {
    return new String(GetStereoTypeAsString_74(id0), StandardCharsets.UTF_8);
  }

  private native void StereoUpdate_75();
  public void StereoUpdate()
  {
    StereoUpdate_75();
  }

  private native void StereoMidpoint_76();
  public void StereoMidpoint()
  {
    StereoMidpoint_76();
  }

  private native void StereoRenderComplete_77();
  public void StereoRenderComplete()
  {
    StereoRenderComplete_77();
  }

  private native void SetAnaglyphColorSaturation_78(float id0);
  public void SetAnaglyphColorSaturation(float id0)
  {
    SetAnaglyphColorSaturation_78(id0);
  }

  private native float GetAnaglyphColorSaturationMinValue_79();
  public float GetAnaglyphColorSaturationMinValue()
  {
    return GetAnaglyphColorSaturationMinValue_79();
  }

  private native float GetAnaglyphColorSaturationMaxValue_80();
  public float GetAnaglyphColorSaturationMaxValue()
  {
    return GetAnaglyphColorSaturationMaxValue_80();
  }

  private native float GetAnaglyphColorSaturation_81();
  public float GetAnaglyphColorSaturation()
  {
    return GetAnaglyphColorSaturation_81();
  }

  private native void SetAnaglyphColorMask_82(int id0,int id1);
  public void SetAnaglyphColorMask(int id0,int id1)
  {
    SetAnaglyphColorMask_82(id0,id1);
  }

  private native void SetAnaglyphColorMask_83(int id0[]);
  public void SetAnaglyphColorMask(int id0[])
  {
    SetAnaglyphColorMask_83(id0);
  }

  private native int[] GetAnaglyphColorMask_84();
  public int[] GetAnaglyphColorMask()
  {
    return GetAnaglyphColorMask_84();
  }

  private native void WindowRemap_85();
  public void WindowRemap()
  {
    WindowRemap_85();
  }

  private native void SetSwapBuffers_86(int id0);
  public void SetSwapBuffers(int id0)
  {
    SetSwapBuffers_86(id0);
  }

  private native int GetSwapBuffers_87();
  public int GetSwapBuffers()
  {
    return GetSwapBuffers_87();
  }

  private native void SwapBuffersOn_88();
  public void SwapBuffersOn()
  {
    SwapBuffersOn_88();
  }

  private native void SwapBuffersOff_89();
  public void SwapBuffersOff()
  {
    SwapBuffersOff_89();
  }

  private native int SetPixelData_90(int id0,int id1,int id2,int id3,vtkUnsignedCharArray id4,int id5,int id6);
  public int SetPixelData(int id0,int id1,int id2,int id3,vtkUnsignedCharArray id4,int id5,int id6)
  {
    return SetPixelData_90(id0,id1,id2,id3,id4,id5,id6);
  }

  private native int GetRGBAPixelData_91(int id0,int id1,int id2,int id3,int id4,vtkFloatArray id5,int id6);
  public int GetRGBAPixelData(int id0,int id1,int id2,int id3,int id4,vtkFloatArray id5,int id6)
  {
    return GetRGBAPixelData_91(id0,id1,id2,id3,id4,id5,id6);
  }

  private native int SetRGBAPixelData_92(int id0,int id1,int id2,int id3,vtkFloatArray id4,int id5,int id6,int id7);
  public int SetRGBAPixelData(int id0,int id1,int id2,int id3,vtkFloatArray id4,int id5,int id6,int id7)
  {
    return SetRGBAPixelData_92(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  private native int GetRGBACharPixelData_93(int id0,int id1,int id2,int id3,int id4,vtkUnsignedCharArray id5,int id6);
  public int GetRGBACharPixelData(int id0,int id1,int id2,int id3,int id4,vtkUnsignedCharArray id5,int id6)
  {
    return GetRGBACharPixelData_93(id0,id1,id2,id3,id4,id5,id6);
  }

  private native int SetRGBACharPixelData_94(int id0,int id1,int id2,int id3,vtkUnsignedCharArray id4,int id5,int id6,int id7);
  public int SetRGBACharPixelData(int id0,int id1,int id2,int id3,vtkUnsignedCharArray id4,int id5,int id6,int id7)
  {
    return SetRGBACharPixelData_94(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  private native int GetZbufferData_95(int id0,int id1,int id2,int id3,vtkFloatArray id4);
  public int GetZbufferData(int id0,int id1,int id2,int id3,vtkFloatArray id4)
  {
    return GetZbufferData_95(id0,id1,id2,id3,id4);
  }

  private native int SetZbufferData_96(int id0,int id1,int id2,int id3,vtkFloatArray id4);
  public int SetZbufferData(int id0,int id1,int id2,int id3,vtkFloatArray id4)
  {
    return SetZbufferData_96(id0,id1,id2,id3,id4);
  }

  private native float GetZbufferDataAtPoint_97(int id0,int id1);
  public float GetZbufferDataAtPoint(int id0,int id1)
  {
    return GetZbufferDataAtPoint_97(id0,id1);
  }

  private native int GetNeverRendered_98();
  public int GetNeverRendered()
  {
    return GetNeverRendered_98();
  }

  private native int GetAbortRender_99();
  public int GetAbortRender()
  {
    return GetAbortRender_99();
  }

  private native void SetAbortRender_100(int id0);
  public void SetAbortRender(int id0)
  {
    SetAbortRender_100(id0);
  }

  private native int GetInAbortCheck_101();
  public int GetInAbortCheck()
  {
    return GetInAbortCheck_101();
  }

  private native void SetInAbortCheck_102(int id0);
  public void SetInAbortCheck(int id0)
  {
    SetInAbortCheck_102(id0);
  }

  private native int CheckAbortStatus_103();
  public int CheckAbortStatus()
  {
    return CheckAbortStatus_103();
  }

  private native int GetEventPending_104();
  public int GetEventPending()
  {
    return GetEventPending_104();
  }

  private native int CheckInRenderStatus_105();
  public int CheckInRenderStatus()
  {
    return CheckInRenderStatus_105();
  }

  private native void ClearInRenderStatus_106();
  public void ClearInRenderStatus()
  {
    ClearInRenderStatus_106();
  }

  private native void SetDesiredUpdateRate_107(double id0);
  public void SetDesiredUpdateRate(double id0)
  {
    SetDesiredUpdateRate_107(id0);
  }

  private native double GetDesiredUpdateRate_108();
  public double GetDesiredUpdateRate()
  {
    return GetDesiredUpdateRate_108();
  }

  private native int GetNumberOfLayers_109();
  public int GetNumberOfLayers()
  {
    return GetNumberOfLayers_109();
  }

  private native void SetNumberOfLayers_110(int id0);
  public void SetNumberOfLayers(int id0)
  {
    SetNumberOfLayers_110(id0);
  }

  private native int GetNumberOfLayersMinValue_111();
  public int GetNumberOfLayersMinValue()
  {
    return GetNumberOfLayersMinValue_111();
  }

  private native int GetNumberOfLayersMaxValue_112();
  public int GetNumberOfLayersMaxValue()
  {
    return GetNumberOfLayersMaxValue_112();
  }

  private native long GetInteractor_113();
  public vtkRenderWindowInteractor GetInteractor()
  {
    long temp = GetInteractor_113();

    if (temp == 0) return null;
    return (vtkRenderWindowInteractor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInteractor_114(vtkRenderWindowInteractor id0);
  public void SetInteractor(vtkRenderWindowInteractor id0)
  {
    SetInteractor_114(id0);
  }

  private native void UnRegister_115(vtkObjectBase id0);
  public void UnRegister(vtkObjectBase id0)
  {
    UnRegister_115(id0);
  }

  private native void SetWindowInfo_116(byte[] id0, int len0);
  public void SetWindowInfo(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetWindowInfo_116(bytes0, bytes0.length);
  }

  private native void SetNextWindowInfo_117(byte[] id0, int len0);
  public void SetNextWindowInfo(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetNextWindowInfo_117(bytes0, bytes0.length);
  }

  private native void SetParentInfo_118(byte[] id0, int len0);
  public void SetParentInfo(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetParentInfo_118(bytes0, bytes0.length);
  }

  private native boolean InitializeFromCurrentContext_119();
  public boolean InitializeFromCurrentContext()
  {
    return InitializeFromCurrentContext_119();
  }

  private native void SetSharedRenderWindow_120(vtkRenderWindow id0);
  public void SetSharedRenderWindow(vtkRenderWindow id0)
  {
    SetSharedRenderWindow_120(id0);
  }

  private native long GetSharedRenderWindow_121();
  public vtkRenderWindow GetSharedRenderWindow()
  {
    long temp = GetSharedRenderWindow_121();

    if (temp == 0) return null;
    return (vtkRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean GetPlatformSupportsRenderWindowSharing_122();
  public boolean GetPlatformSupportsRenderWindowSharing()
  {
    return GetPlatformSupportsRenderWindowSharing_122();
  }

  private native boolean IsCurrent_123();
  public boolean IsCurrent()
  {
    return IsCurrent_123();
  }

  private native void SetForceMakeCurrent_124();
  public void SetForceMakeCurrent()
  {
    SetForceMakeCurrent_124();
  }

  private native byte[] ReportCapabilities_125();
  public String ReportCapabilities()
  {
    return new String(ReportCapabilities_125(), StandardCharsets.UTF_8);
  }

  private native int SupportsOpenGL_126();
  public int SupportsOpenGL()
  {
    return SupportsOpenGL_126();
  }

  private native int IsDirect_127();
  public int IsDirect()
  {
    return IsDirect_127();
  }

  private native int GetDepthBufferSize_128();
  public int GetDepthBufferSize()
  {
    return GetDepthBufferSize_128();
  }

  private native void SetMultiSamples_129(int id0);
  public void SetMultiSamples(int id0)
  {
    SetMultiSamples_129(id0);
  }

  private native int GetMultiSamples_130();
  public int GetMultiSamples()
  {
    return GetMultiSamples_130();
  }

  private native void SetStencilCapable_131(int id0);
  public void SetStencilCapable(int id0)
  {
    SetStencilCapable_131(id0);
  }

  private native int GetStencilCapable_132();
  public int GetStencilCapable()
  {
    return GetStencilCapable_132();
  }

  private native void StencilCapableOn_133();
  public void StencilCapableOn()
  {
    StencilCapableOn_133();
  }

  private native void StencilCapableOff_134();
  public void StencilCapableOff()
  {
    StencilCapableOff_134();
  }

  private native void SetDeviceIndex_135(int id0);
  public void SetDeviceIndex(int id0)
  {
    SetDeviceIndex_135(id0);
  }

  private native int GetDeviceIndex_136();
  public int GetDeviceIndex()
  {
    return GetDeviceIndex_136();
  }

  private native int GetNumberOfDevices_137();
  public int GetNumberOfDevices()
  {
    return GetNumberOfDevices_137();
  }

  private native boolean GetUseSRGBColorSpace_138();
  public boolean GetUseSRGBColorSpace()
  {
    return GetUseSRGBColorSpace_138();
  }

  private native void SetUseSRGBColorSpace_139(boolean id0);
  public void SetUseSRGBColorSpace(boolean id0)
  {
    SetUseSRGBColorSpace_139(id0);
  }

  private native void UseSRGBColorSpaceOn_140();
  public void UseSRGBColorSpaceOn()
  {
    UseSRGBColorSpaceOn_140();
  }

  private native void UseSRGBColorSpaceOff_141();
  public void UseSRGBColorSpaceOff()
  {
    UseSRGBColorSpaceOff_141();
  }

  private native void GetPhysicalToWorldMatrix_142(vtkMatrix4x4 id0);
  public void GetPhysicalToWorldMatrix(vtkMatrix4x4 id0)
  {
    GetPhysicalToWorldMatrix_142(id0);
  }

  public vtkRenderWindow() { super(); }

  public vtkRenderWindow(long id) { super(id); }
  public native long   VTKInit();

}
