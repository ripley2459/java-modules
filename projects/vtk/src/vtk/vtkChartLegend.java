// java wrapper for vtkChartLegend object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkChartLegend extends vtkContextItem
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

  private native void SetPoint_4(float id0,float id1);
  public void SetPoint(float id0,float id1)
  {
    SetPoint_4(id0,id1);
  }

  private native void SetPoint_5(float id0[]);
  public void SetPoint(float id0[])
  {
    SetPoint_5(id0);
  }

  private native float[] GetPoint_6();
  public float[] GetPoint()
  {
    return GetPoint_6();
  }

  private native void SetHorizontalAlignment_7(int id0);
  public void SetHorizontalAlignment(int id0)
  {
    SetHorizontalAlignment_7(id0);
  }

  private native int GetHorizontalAlignment_8();
  public int GetHorizontalAlignment()
  {
    return GetHorizontalAlignment_8();
  }

  private native void SetVerticalAlignment_9(int id0);
  public void SetVerticalAlignment(int id0)
  {
    SetVerticalAlignment_9(id0);
  }

  private native int GetVerticalAlignment_10();
  public int GetVerticalAlignment()
  {
    return GetVerticalAlignment_10();
  }

  private native void SetPadding_11(int id0);
  public void SetPadding(int id0)
  {
    SetPadding_11(id0);
  }

  private native int GetPadding_12();
  public int GetPadding()
  {
    return GetPadding_12();
  }

  private native void SetSymbolWidth_13(int id0);
  public void SetSymbolWidth(int id0)
  {
    SetSymbolWidth_13(id0);
  }

  private native int GetSymbolWidth_14();
  public int GetSymbolWidth()
  {
    return GetSymbolWidth_14();
  }

  private native void SetLabelSize_15(int id0);
  public void SetLabelSize(int id0)
  {
    SetLabelSize_15(id0);
  }

  private native int GetLabelSize_16();
  public int GetLabelSize()
  {
    return GetLabelSize_16();
  }

  private native void SetInline_17(boolean id0);
  public void SetInline(boolean id0)
  {
    SetInline_17(id0);
  }

  private native boolean GetInline_18();
  public boolean GetInline()
  {
    return GetInline_18();
  }

  private native void SetDragEnabled_19(boolean id0);
  public void SetDragEnabled(boolean id0)
  {
    SetDragEnabled_19(id0);
  }

  private native boolean GetDragEnabled_20();
  public boolean GetDragEnabled()
  {
    return GetDragEnabled_20();
  }

  private native void SetChart_21(vtkChart id0);
  public void SetChart(vtkChart id0)
  {
    SetChart_21(id0);
  }

  private native long GetChart_22();
  public vtkChart GetChart()
  {
    long temp = GetChart_22();

    if (temp == 0) return null;
    return (vtkChart)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Update_23();
  public void Update()
  {
    Update_23();
  }

  private native boolean Paint_24(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_24(id0);
  }

  private native long GetPen_25();
  public vtkPen GetPen()
  {
    long temp = GetPen_25();

    if (temp == 0) return null;
    return (vtkPen)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetBrush_26();
  public vtkBrush GetBrush()
  {
    long temp = GetBrush_26();

    if (temp == 0) return null;
    return (vtkBrush)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLabelProperties_27();
  public vtkTextProperty GetLabelProperties()
  {
    long temp = GetLabelProperties_27();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCacheBounds_28(boolean id0);
  public void SetCacheBounds(boolean id0)
  {
    SetCacheBounds_28(id0);
  }

  private native boolean GetCacheBounds_29();
  public boolean GetCacheBounds()
  {
    return GetCacheBounds_29();
  }

  private native void CacheBoundsOn_30();
  public void CacheBoundsOn()
  {
    CacheBoundsOn_30();
  }

  private native void CacheBoundsOff_31();
  public void CacheBoundsOff()
  {
    CacheBoundsOff_31();
  }

  public vtkChartLegend() { super(); }

  public vtkChartLegend(long id) { super(id); }
  public native long   VTKInit();

}
