// java wrapper for vtkViewport object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkViewport extends vtkObject
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

  private native void AddViewProp_4(vtkProp id0);
  public void AddViewProp(vtkProp id0)
  {
    AddViewProp_4(id0);
  }

  private native long GetViewProps_5();
  public vtkPropCollection GetViewProps()
  {
    long temp = GetViewProps_5();

    if (temp == 0) return null;
    return (vtkPropCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int HasViewProp_6(vtkProp id0);
  public int HasViewProp(vtkProp id0)
  {
    return HasViewProp_6(id0);
  }

  private native void RemoveViewProp_7(vtkProp id0);
  public void RemoveViewProp(vtkProp id0)
  {
    RemoveViewProp_7(id0);
  }

  private native void RemoveAllViewProps_8();
  public void RemoveAllViewProps()
  {
    RemoveAllViewProps_8();
  }

  private native void AddActor2D_9(vtkProp id0);
  public void AddActor2D(vtkProp id0)
  {
    AddActor2D_9(id0);
  }

  private native void RemoveActor2D_10(vtkProp id0);
  public void RemoveActor2D(vtkProp id0)
  {
    RemoveActor2D_10(id0);
  }

  private native long GetActors2D_11();
  public vtkActor2DCollection GetActors2D()
  {
    long temp = GetActors2D_11();

    if (temp == 0) return null;
    return (vtkActor2DCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBackground_12(double id0,double id1,double id2);
  public void SetBackground(double id0,double id1,double id2)
  {
    SetBackground_12(id0,id1,id2);
  }

  private native void SetBackground_13(double id0[]);
  public void SetBackground(double id0[])
  {
    SetBackground_13(id0);
  }

  private native double[] GetBackground_14();
  public double[] GetBackground()
  {
    return GetBackground_14();
  }

  private native void SetBackground2_15(double id0,double id1,double id2);
  public void SetBackground2(double id0,double id1,double id2)
  {
    SetBackground2_15(id0,id1,id2);
  }

  private native void SetBackground2_16(double id0[]);
  public void SetBackground2(double id0[])
  {
    SetBackground2_16(id0);
  }

  private native double[] GetBackground2_17();
  public double[] GetBackground2()
  {
    return GetBackground2_17();
  }

  private native void SetBackgroundAlpha_18(double id0);
  public void SetBackgroundAlpha(double id0)
  {
    SetBackgroundAlpha_18(id0);
  }

  private native double GetBackgroundAlphaMinValue_19();
  public double GetBackgroundAlphaMinValue()
  {
    return GetBackgroundAlphaMinValue_19();
  }

  private native double GetBackgroundAlphaMaxValue_20();
  public double GetBackgroundAlphaMaxValue()
  {
    return GetBackgroundAlphaMaxValue_20();
  }

  private native double GetBackgroundAlpha_21();
  public double GetBackgroundAlpha()
  {
    return GetBackgroundAlpha_21();
  }

  private native void SetGradientBackground_22(boolean id0);
  public void SetGradientBackground(boolean id0)
  {
    SetGradientBackground_22(id0);
  }

  private native boolean GetGradientBackground_23();
  public boolean GetGradientBackground()
  {
    return GetGradientBackground_23();
  }

  private native void GradientBackgroundOn_24();
  public void GradientBackgroundOn()
  {
    GradientBackgroundOn_24();
  }

  private native void GradientBackgroundOff_25();
  public void GradientBackgroundOff()
  {
    GradientBackgroundOff_25();
  }

  private native void SetGradientMode_26(int id0);
  public void SetGradientMode(int id0)
  {
    SetGradientMode_26(id0);
  }

  private native int GetGradientMode_27();
  public int GetGradientMode()
  {
    return GetGradientMode_27();
  }

  private native void SetAspect_28(double id0,double id1);
  public void SetAspect(double id0,double id1)
  {
    SetAspect_28(id0,id1);
  }

  private native void SetAspect_29(double id0[]);
  public void SetAspect(double id0[])
  {
    SetAspect_29(id0);
  }

  private native double[] GetAspect_30();
  public double[] GetAspect()
  {
    return GetAspect_30();
  }

  private native void ComputeAspect_31();
  public void ComputeAspect()
  {
    ComputeAspect_31();
  }

  private native void SetPixelAspect_32(double id0,double id1);
  public void SetPixelAspect(double id0,double id1)
  {
    SetPixelAspect_32(id0,id1);
  }

  private native void SetPixelAspect_33(double id0[]);
  public void SetPixelAspect(double id0[])
  {
    SetPixelAspect_33(id0);
  }

  private native double[] GetPixelAspect_34();
  public double[] GetPixelAspect()
  {
    return GetPixelAspect_34();
  }

  private native void SetViewport_35(double id0,double id1,double id2,double id3);
  public void SetViewport(double id0,double id1,double id2,double id3)
  {
    SetViewport_35(id0,id1,id2,id3);
  }

  private native void SetViewport_36(double id0[]);
  public void SetViewport(double id0[])
  {
    SetViewport_36(id0);
  }

  private native double[] GetViewport_37();
  public double[] GetViewport()
  {
    return GetViewport_37();
  }

  private native void SetDisplayPoint_38(double id0,double id1,double id2);
  public void SetDisplayPoint(double id0,double id1,double id2)
  {
    SetDisplayPoint_38(id0,id1,id2);
  }

  private native void SetDisplayPoint_39(double id0[]);
  public void SetDisplayPoint(double id0[])
  {
    SetDisplayPoint_39(id0);
  }

  private native double[] GetDisplayPoint_40();
  public double[] GetDisplayPoint()
  {
    return GetDisplayPoint_40();
  }

  private native void SetViewPoint_41(double id0,double id1,double id2);
  public void SetViewPoint(double id0,double id1,double id2)
  {
    SetViewPoint_41(id0,id1,id2);
  }

  private native void SetViewPoint_42(double id0[]);
  public void SetViewPoint(double id0[])
  {
    SetViewPoint_42(id0);
  }

  private native double[] GetViewPoint_43();
  public double[] GetViewPoint()
  {
    return GetViewPoint_43();
  }

  private native void SetWorldPoint_44(double id0,double id1,double id2,double id3);
  public void SetWorldPoint(double id0,double id1,double id2,double id3)
  {
    SetWorldPoint_44(id0,id1,id2,id3);
  }

  private native void SetWorldPoint_45(double id0[]);
  public void SetWorldPoint(double id0[])
  {
    SetWorldPoint_45(id0);
  }

  private native double[] GetWorldPoint_46();
  public double[] GetWorldPoint()
  {
    return GetWorldPoint_46();
  }

  private native double[] GetCenter_47();
  public double[] GetCenter()
  {
    return GetCenter_47();
  }

  private native int IsInViewport_48(int id0,int id1);
  public int IsInViewport(int id0,int id1)
  {
    return IsInViewport_48(id0,id1);
  }

  private native long GetVTKWindow_49();
  public vtkWindow GetVTKWindow()
  {
    long temp = GetVTKWindow_49();

    if (temp == 0) return null;
    return (vtkWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void DisplayToView_50();
  public void DisplayToView()
  {
    DisplayToView_50();
  }

  private native void ViewToDisplay_51();
  public void ViewToDisplay()
  {
    ViewToDisplay_51();
  }

  private native void WorldToView_52();
  public void WorldToView()
  {
    WorldToView_52();
  }

  private native void ViewToWorld_53();
  public void ViewToWorld()
  {
    ViewToWorld_53();
  }

  private native void DisplayToWorld_54();
  public void DisplayToWorld()
  {
    DisplayToWorld_54();
  }

  private native void WorldToDisplay_55();
  public void WorldToDisplay()
  {
    WorldToDisplay_55();
  }

  private native int[] GetSize_56();
  public int[] GetSize()
  {
    return GetSize_56();
  }

  private native int[] GetOrigin_57();
  public int[] GetOrigin()
  {
    return GetOrigin_57();
  }

  private native long PickProp_58(double id0,double id1);
  public vtkAssemblyPath PickProp(double id0,double id1)
  {
    long temp = PickProp_58(id0,id1);

    if (temp == 0) return null;
    return (vtkAssemblyPath)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long PickProp_59(double id0,double id1,double id2,double id3);
  public vtkAssemblyPath PickProp(double id0,double id1,double id2,double id3)
  {
    long temp = PickProp_59(id0,id1,id2,id3);

    if (temp == 0) return null;
    return (vtkAssemblyPath)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long PickPropFrom_60(double id0,double id1,vtkPropCollection id2);
  public vtkAssemblyPath PickPropFrom(double id0,double id1,vtkPropCollection id2)
  {
    long temp = PickPropFrom_60(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkAssemblyPath)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long PickPropFrom_61(double id0,double id1,double id2,double id3,vtkPropCollection id4);
  public vtkAssemblyPath PickPropFrom(double id0,double id1,double id2,double id3,vtkPropCollection id4)
  {
    long temp = PickPropFrom_61(id0,id1,id2,id3,id4);

    if (temp == 0) return null;
    return (vtkAssemblyPath)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native double GetPickX_62();
  public double GetPickX()
  {
    return GetPickX_62();
  }

  private native double GetPickY_63();
  public double GetPickY()
  {
    return GetPickY_63();
  }

  private native double GetPickWidth_64();
  public double GetPickWidth()
  {
    return GetPickWidth_64();
  }

  private native double GetPickHeight_65();
  public double GetPickHeight()
  {
    return GetPickHeight_65();
  }

  private native double GetPickX1_66();
  public double GetPickX1()
  {
    return GetPickX1_66();
  }

  private native double GetPickY1_67();
  public double GetPickY1()
  {
    return GetPickY1_67();
  }

  private native double GetPickX2_68();
  public double GetPickX2()
  {
    return GetPickX2_68();
  }

  private native double GetPickY2_69();
  public double GetPickY2()
  {
    return GetPickY2_69();
  }

  private native long GetPickResultProps_70();
  public vtkPropCollection GetPickResultProps()
  {
    long temp = GetPickResultProps_70();

    if (temp == 0) return null;
    return (vtkPropCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native double GetPickedZ_71();
  public double GetPickedZ()
  {
    return GetPickedZ_71();
  }

  private native void SetEnvironmentalBG_72(double id0,double id1,double id2);
  public void SetEnvironmentalBG(double id0,double id1,double id2)
  {
    SetEnvironmentalBG_72(id0,id1,id2);
  }

  private native void SetEnvironmentalBG_73(double id0[]);
  public void SetEnvironmentalBG(double id0[])
  {
    SetEnvironmentalBG_73(id0);
  }

  private native double[] GetEnvironmentalBG_74();
  public double[] GetEnvironmentalBG()
  {
    return GetEnvironmentalBG_74();
  }

  private native void SetEnvironmentalBG2_75(double id0,double id1,double id2);
  public void SetEnvironmentalBG2(double id0,double id1,double id2)
  {
    SetEnvironmentalBG2_75(id0,id1,id2);
  }

  private native void SetEnvironmentalBG2_76(double id0[]);
  public void SetEnvironmentalBG2(double id0[])
  {
    SetEnvironmentalBG2_76(id0);
  }

  private native double[] GetEnvironmentalBG2_77();
  public double[] GetEnvironmentalBG2()
  {
    return GetEnvironmentalBG2_77();
  }

  private native void SetGradientEnvironmentalBG_78(boolean id0);
  public void SetGradientEnvironmentalBG(boolean id0)
  {
    SetGradientEnvironmentalBG_78(id0);
  }

  private native boolean GetGradientEnvironmentalBG_79();
  public boolean GetGradientEnvironmentalBG()
  {
    return GetGradientEnvironmentalBG_79();
  }

  private native void GradientEnvironmentalBGOn_80();
  public void GradientEnvironmentalBGOn()
  {
    GradientEnvironmentalBGOn_80();
  }

  private native void GradientEnvironmentalBGOff_81();
  public void GradientEnvironmentalBGOff()
  {
    GradientEnvironmentalBGOff_81();
  }

  public vtkViewport() { super(); }

  public vtkViewport(long id) { super(id); }

}
