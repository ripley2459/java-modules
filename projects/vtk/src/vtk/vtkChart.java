// java wrapper for vtkChart object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkChart extends vtkContextItem
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

  private native boolean Paint_4(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_4(id0);
  }

  private native long AddPlot_5(int id0);
  public vtkPlot AddPlot(int id0)
  {
    long temp = AddPlot_5(id0);

    if (temp == 0) return null;
    return (vtkPlot)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long AddPlot_6(vtkPlot id0);
  public long AddPlot(vtkPlot id0)
  {
    return AddPlot_6(id0);
  }

  private native boolean RemovePlot_7(long id0);
  public boolean RemovePlot(long id0)
  {
    return RemovePlot_7(id0);
  }

  private native boolean RemovePlotInstance_8(vtkPlot id0);
  public boolean RemovePlotInstance(vtkPlot id0)
  {
    return RemovePlotInstance_8(id0);
  }

  private native void ClearPlots_9();
  public void ClearPlots()
  {
    ClearPlots_9();
  }

  private native long GetPlot_10(long id0);
  public vtkPlot GetPlot(long id0)
  {
    long temp = GetPlot_10(id0);

    if (temp == 0) return null;
    return (vtkPlot)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNumberOfPlots_11();
  public long GetNumberOfPlots()
  {
    return GetNumberOfPlots_11();
  }

  private native long GetAxis_12(int id0);
  public vtkAxis GetAxis(int id0)
  {
    long temp = GetAxis_12(id0);

    if (temp == 0) return null;
    return (vtkAxis)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAxis_13(int id0,vtkAxis id1);
  public void SetAxis(int id0,vtkAxis id1)
  {
    SetAxis_13(id0,id1);
  }

  private native long GetNumberOfAxes_14();
  public long GetNumberOfAxes()
  {
    return GetNumberOfAxes_14();
  }

  private native void RecalculateBounds_15();
  public void RecalculateBounds()
  {
    RecalculateBounds_15();
  }

  private native void SetSelectionMethod_16(int id0);
  public void SetSelectionMethod(int id0)
  {
    SetSelectionMethod_16(id0);
  }

  private native int GetSelectionMethod_17();
  public int GetSelectionMethod()
  {
    return GetSelectionMethod_17();
  }

  private native void SetAnnotationLink_18(vtkAnnotationLink id0);
  public void SetAnnotationLink(vtkAnnotationLink id0)
  {
    SetAnnotationLink_18(id0);
  }

  private native long GetAnnotationLink_19();
  public vtkAnnotationLink GetAnnotationLink()
  {
    long temp = GetAnnotationLink_19();

    if (temp == 0) return null;
    return (vtkAnnotationLink)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGeometry_20(int id0,int id1);
  public void SetGeometry(int id0,int id1)
  {
    SetGeometry_20(id0,id1);
  }

  private native void SetGeometry_21(int id0[]);
  public void SetGeometry(int id0[])
  {
    SetGeometry_21(id0);
  }

  private native int[] GetGeometry_22();
  public int[] GetGeometry()
  {
    return GetGeometry_22();
  }

  private native void SetPoint1_23(int id0,int id1);
  public void SetPoint1(int id0,int id1)
  {
    SetPoint1_23(id0,id1);
  }

  private native void SetPoint1_24(int id0[]);
  public void SetPoint1(int id0[])
  {
    SetPoint1_24(id0);
  }

  private native int[] GetPoint1_25();
  public int[] GetPoint1()
  {
    return GetPoint1_25();
  }

  private native void SetPoint2_26(int id0,int id1);
  public void SetPoint2(int id0,int id1)
  {
    SetPoint2_26(id0,id1);
  }

  private native void SetPoint2_27(int id0[]);
  public void SetPoint2(int id0[])
  {
    SetPoint2_27(id0);
  }

  private native int[] GetPoint2_28();
  public int[] GetPoint2()
  {
    return GetPoint2_28();
  }

  private native void SetShowLegend_29(boolean id0);
  public void SetShowLegend(boolean id0)
  {
    SetShowLegend_29(id0);
  }

  private native boolean GetShowLegend_30();
  public boolean GetShowLegend()
  {
    return GetShowLegend_30();
  }

  private native long GetLegend_31();
  public vtkChartLegend GetLegend()
  {
    long temp = GetLegend_31();

    if (temp == 0) return null;
    return (vtkChartLegend)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTitle_32(byte[] id0, int len0);
  public void SetTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTitle_32(bytes0, bytes0.length);
  }

  private native byte[] GetTitle_33();
  public String GetTitle()
  {
    return new String(GetTitle_33(), StandardCharsets.UTF_8);
  }

  private native long GetTitleProperties_34();
  public vtkTextProperty GetTitleProperties()
  {
    long temp = GetTitleProperties_34();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBottomBorder_35(int id0);
  public void SetBottomBorder(int id0)
  {
    SetBottomBorder_35(id0);
  }

  private native void SetTopBorder_36(int id0);
  public void SetTopBorder(int id0)
  {
    SetTopBorder_36(id0);
  }

  private native void SetLeftBorder_37(int id0);
  public void SetLeftBorder(int id0)
  {
    SetLeftBorder_37(id0);
  }

  private native void SetRightBorder_38(int id0);
  public void SetRightBorder(int id0)
  {
    SetRightBorder_38(id0);
  }

  private native void SetBorders_39(int id0,int id1,int id2,int id3);
  public void SetBorders(int id0,int id1,int id2,int id3)
  {
    SetBorders_39(id0,id1,id2,id3);
  }

  private native void SetLayoutStrategy_40(int id0);
  public void SetLayoutStrategy(int id0)
  {
    SetLayoutStrategy_40(id0);
  }

  private native int GetLayoutStrategy_41();
  public int GetLayoutStrategy()
  {
    return GetLayoutStrategy_41();
  }

  private native void SetAutoSize_42(boolean id0);
  public void SetAutoSize(boolean id0)
  {
    SetAutoSize_42(id0);
  }

  private native boolean GetAutoSize_43();
  public boolean GetAutoSize()
  {
    return GetAutoSize_43();
  }

  private native void SetRenderEmpty_44(boolean id0);
  public void SetRenderEmpty(boolean id0)
  {
    SetRenderEmpty_44(id0);
  }

  private native boolean GetRenderEmpty_45();
  public boolean GetRenderEmpty()
  {
    return GetRenderEmpty_45();
  }

  private native void SetActionToButton_46(int id0,int id1);
  public void SetActionToButton(int id0,int id1)
  {
    SetActionToButton_46(id0,id1);
  }

  private native int GetActionToButton_47(int id0);
  public int GetActionToButton(int id0)
  {
    return GetActionToButton_47(id0);
  }

  private native void SetClickActionToButton_48(int id0,int id1);
  public void SetClickActionToButton(int id0,int id1)
  {
    SetClickActionToButton_48(id0,id1);
  }

  private native int GetClickActionToButton_49(int id0);
  public int GetClickActionToButton(int id0)
  {
    return GetClickActionToButton_49(id0);
  }

  private native void SetBackgroundBrush_50(vtkBrush id0);
  public void SetBackgroundBrush(vtkBrush id0)
  {
    SetBackgroundBrush_50(id0);
  }

  private native long GetBackgroundBrush_51();
  public vtkBrush GetBackgroundBrush()
  {
    long temp = GetBackgroundBrush_51();

    if (temp == 0) return null;
    return (vtkBrush)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSelectionMode_52(int id0);
  public void SetSelectionMode(int id0)
  {
    SetSelectionMode_52(id0);
  }

  private native int GetSelectionModeMinValue_53();
  public int GetSelectionModeMinValue()
  {
    return GetSelectionModeMinValue_53();
  }

  private native int GetSelectionModeMaxValue_54();
  public int GetSelectionModeMaxValue()
  {
    return GetSelectionModeMaxValue_54();
  }

  private native int GetSelectionMode_55();
  public int GetSelectionMode()
  {
    return GetSelectionMode_55();
  }

  public vtkChart() { super(); }

  public vtkChart(long id) { super(id); }

}
