// java wrapper for vtkHyperTreeCursor object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkHyperTreeCursor extends vtkObject
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

  private native void SetTree_4(vtkHyperTree id0);
  public void SetTree(vtkHyperTree id0)
  {
    SetTree_4(id0);
  }

  private native long GetTree_5();
  public vtkHyperTree GetTree()
  {
    long temp = GetTree_5();

    if (temp == 0) return null;
    return (vtkHyperTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetVertexId_6();
  public long GetVertexId()
  {
    return GetVertexId_6();
  }

  private native boolean IsLeaf_7();
  public boolean IsLeaf()
  {
    return IsLeaf_7();
  }

  private native boolean IsRoot_8();
  public boolean IsRoot()
  {
    return IsRoot_8();
  }

  private native int GetLevel_9();
  public int GetLevel()
  {
    return GetLevel_9();
  }

  private native int GetChildIndex_10();
  public int GetChildIndex()
  {
    return GetChildIndex_10();
  }

  private native void ToRoot_11();
  public void ToRoot()
  {
    ToRoot_11();
  }

  private native void ToParent_12();
  public void ToParent()
  {
    ToParent_12();
  }

  private native void ToChild_13(int id0);
  public void ToChild(int id0)
  {
    ToChild_13(id0);
  }

  private native void ToSameVertex_14(vtkHyperTreeCursor id0);
  public void ToSameVertex(vtkHyperTreeCursor id0)
  {
    ToSameVertex_14(id0);
  }

  private native boolean IsEqual_15(vtkHyperTreeCursor id0);
  public boolean IsEqual(vtkHyperTreeCursor id0)
  {
    return IsEqual_15(id0);
  }

  private native long Clone_16();
  public vtkHyperTreeCursor Clone()
  {
    long temp = Clone_16();

    if (temp == 0) return null;
    return (vtkHyperTreeCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int SameTree_17(vtkHyperTreeCursor id0);
  public int SameTree(vtkHyperTreeCursor id0)
  {
    return SameTree_17(id0);
  }

  private native int GetNumberOfChildren_18();
  public int GetNumberOfChildren()
  {
    return GetNumberOfChildren_18();
  }

  private native int GetDimension_19();
  public int GetDimension()
  {
    return GetDimension_19();
  }

  public vtkHyperTreeCursor() { super(); }

  public vtkHyperTreeCursor(long id) { super(id); }

}
