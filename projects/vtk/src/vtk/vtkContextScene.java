// java wrapper for vtkContextScene object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkContextScene extends vtkObject
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

  private native int AddItem_5(vtkAbstractContextItem id0);
  public int AddItem(vtkAbstractContextItem id0)
  {
    return AddItem_5(id0);
  }

  private native boolean RemoveItem_6(vtkAbstractContextItem id0);
  public boolean RemoveItem(vtkAbstractContextItem id0)
  {
    return RemoveItem_6(id0);
  }

  private native boolean RemoveItem_7(int id0);
  public boolean RemoveItem(int id0)
  {
    return RemoveItem_7(id0);
  }

  private native long GetItem_8(int id0);
  public vtkAbstractContextItem GetItem(int id0)
  {
    long temp = GetItem_8(id0);

    if (temp == 0) return null;
    return (vtkAbstractContextItem)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfItems_9();
  public int GetNumberOfItems()
  {
    return GetNumberOfItems_9();
  }

  private native void ClearItems_10();
  public void ClearItems()
  {
    ClearItems_10();
  }

  private native void SetAnnotationLink_11(vtkAnnotationLink id0);
  public void SetAnnotationLink(vtkAnnotationLink id0)
  {
    SetAnnotationLink_11(id0);
  }

  private native long GetAnnotationLink_12();
  public vtkAnnotationLink GetAnnotationLink()
  {
    long temp = GetAnnotationLink_12();

    if (temp == 0) return null;
    return (vtkAnnotationLink)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOrigin_13(int id0,int id1);
  public void SetOrigin(int id0,int id1)
  {
    SetOrigin_13(id0,id1);
  }

  private native void SetOrigin_14(int id0[]);
  public void SetOrigin(int id0[])
  {
    SetOrigin_14(id0);
  }

  private native int[] GetOrigin_15();
  public int[] GetOrigin()
  {
    return GetOrigin_15();
  }

  private native void SetGeometry_16(int id0,int id1);
  public void SetGeometry(int id0,int id1)
  {
    SetGeometry_16(id0,id1);
  }

  private native void SetGeometry_17(int id0[]);
  public void SetGeometry(int id0[])
  {
    SetGeometry_17(id0);
  }

  private native int[] GetGeometry_18();
  public int[] GetGeometry()
  {
    return GetGeometry_18();
  }

  private native void SetUseBufferId_19(boolean id0);
  public void SetUseBufferId(boolean id0)
  {
    SetUseBufferId_19(id0);
  }

  private native boolean GetUseBufferId_20();
  public boolean GetUseBufferId()
  {
    return GetUseBufferId_20();
  }

  private native int GetViewWidth_21();
  public int GetViewWidth()
  {
    return GetViewWidth_21();
  }

  private native int GetViewHeight_22();
  public int GetViewHeight()
  {
    return GetViewHeight_22();
  }

  private native int GetSceneLeft_23();
  public int GetSceneLeft()
  {
    return GetSceneLeft_23();
  }

  private native int GetSceneBottom_24();
  public int GetSceneBottom()
  {
    return GetSceneBottom_24();
  }

  private native int GetSceneWidth_25();
  public int GetSceneWidth()
  {
    return GetSceneWidth_25();
  }

  private native int GetSceneHeight_26();
  public int GetSceneHeight()
  {
    return GetSceneHeight_26();
  }

  private native void SetScaleTiles_27(boolean id0);
  public void SetScaleTiles(boolean id0)
  {
    SetScaleTiles_27(id0);
  }

  private native boolean GetScaleTiles_28();
  public boolean GetScaleTiles()
  {
    return GetScaleTiles_28();
  }

  private native void ScaleTilesOn_29();
  public void ScaleTilesOn()
  {
    ScaleTilesOn_29();
  }

  private native void ScaleTilesOff_30();
  public void ScaleTilesOff()
  {
    ScaleTilesOff_30();
  }

  private native void SetRenderer_31(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_31(id0);
  }

  private native long GetRenderer_32();
  public vtkRenderer GetRenderer()
  {
    long temp = GetRenderer_32();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDirty_33(boolean id0);
  public void SetDirty(boolean id0)
  {
    SetDirty_33(id0);
  }

  private native boolean GetDirty_34();
  public boolean GetDirty()
  {
    return GetDirty_34();
  }

  private native void ReleaseGraphicsResources_35();
  public void ReleaseGraphicsResources()
  {
    ReleaseGraphicsResources_35();
  }

  private native long GetBufferId_36();
  public vtkAbstractContextBufferId GetBufferId()
  {
    long temp = GetBufferId_36();

    if (temp == 0) return null;
    return (vtkAbstractContextBufferId)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTransform_37(vtkTransform2D id0);
  public void SetTransform(vtkTransform2D id0)
  {
    SetTransform_37(id0);
  }

  private native long GetTransform_38();
  public vtkTransform2D GetTransform()
  {
    long temp = GetTransform_38();

    if (temp == 0) return null;
    return (vtkTransform2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean HasTransform_39();
  public boolean HasTransform()
  {
    return HasTransform_39();
  }

  private native long GetPickedItem_40(int id0,int id1);
  public long GetPickedItem(int id0,int id1)
  {
    return GetPickedItem_40(id0,id1);
  }

  private native long GetPickedItem_41();
  public vtkAbstractContextItem GetPickedItem()
  {
    long temp = GetPickedItem_41();

    if (temp == 0) return null;
    return (vtkAbstractContextItem)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkContextScene() { super(); }

  public vtkContextScene(long id) { super(id); }
  public native long   VTKInit();

}
