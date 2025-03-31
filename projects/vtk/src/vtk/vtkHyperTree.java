// java wrapper for vtkHyperTree object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkHyperTree extends vtkObject
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

  private native void Initialize_4(byte id0,byte id1,byte id2);
  public void Initialize(byte id0,byte id1,byte id2)
  {
    Initialize_4(id0,id1,id2);
  }

  private native void InitializeForReader_5(long id0,long id1,long id2,vtkBitArray id3,vtkBitArray id4,vtkBitArray id5);
  public void InitializeForReader(long id0,long id1,long id2,vtkBitArray id3,vtkBitArray id4,vtkBitArray id5)
  {
    InitializeForReader_5(id0,id1,id2,id3,id4,id5);
  }

  private native void BuildFromBreadthFirstOrderDescriptor_6(vtkBitArray id0,long id1,long id2);
  public void BuildFromBreadthFirstOrderDescriptor(vtkBitArray id0,long id1,long id2)
  {
    BuildFromBreadthFirstOrderDescriptor_6(id0,id1,id2);
  }

  private native void ComputeBreadthFirstOrderDescriptor_7(vtkBitArray id0,vtkTypeInt64Array id1,vtkBitArray id2,vtkIdList id3);
  public void ComputeBreadthFirstOrderDescriptor(vtkBitArray id0,vtkTypeInt64Array id1,vtkBitArray id2,vtkIdList id3)
  {
    ComputeBreadthFirstOrderDescriptor_7(id0,id1,id2,id3);
  }

  private native void CopyStructure_8(vtkHyperTree id0);
  public void CopyStructure(vtkHyperTree id0)
  {
    CopyStructure_8(id0);
  }

  private native long Freeze_9(byte[] id0, int len0);
  public vtkHyperTree Freeze(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = Freeze_9(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkHyperTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTreeIndex_10(long id0);
  public void SetTreeIndex(long id0)
  {
    SetTreeIndex_10(id0);
  }

  private native long GetTreeIndex_11();
  public long GetTreeIndex()
  {
    return GetTreeIndex_11();
  }

  private native int GetNumberOfLevels_12();
  public int GetNumberOfLevels()
  {
    return GetNumberOfLevels_12();
  }

  private native long GetNumberOfVertices_13();
  public long GetNumberOfVertices()
  {
    return GetNumberOfVertices_13();
  }

  private native long GetNumberOfNodes_14();
  public long GetNumberOfNodes()
  {
    return GetNumberOfNodes_14();
  }

  private native long GetNumberOfLeaves_15();
  public long GetNumberOfLeaves()
  {
    return GetNumberOfLeaves_15();
  }

  private native int GetBranchFactor_16();
  public int GetBranchFactor()
  {
    return GetBranchFactor_16();
  }

  private native int GetDimension_17();
  public int GetDimension()
  {
    return GetDimension_17();
  }

  private native long GetNumberOfChildren_18();
  public long GetNumberOfChildren()
  {
    return GetNumberOfChildren_18();
  }

  private native void GetScale_19(double id0[]);
  public void GetScale(double id0[])
  {
    GetScale_19(id0);
  }

  private native double GetScale_20(int id0);
  public double GetScale(int id0)
  {
    return GetScale_20(id0);
  }

  private native long CreateInstance_21(byte id0,byte id1);
  public vtkHyperTree CreateInstance(byte id0,byte id1)
  {
    long temp = CreateInstance_21(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetActualMemorySizeBytes_22();
  public long GetActualMemorySizeBytes()
  {
    return GetActualMemorySizeBytes_22();
  }

  private native int GetActualMemorySize_23();
  public int GetActualMemorySize()
  {
    return GetActualMemorySize_23();
  }

  private native boolean IsGlobalIndexImplicit_24();
  public boolean IsGlobalIndexImplicit()
  {
    return IsGlobalIndexImplicit_24();
  }

  private native void SetGlobalIndexStart_25(long id0);
  public void SetGlobalIndexStart(long id0)
  {
    SetGlobalIndexStart_25(id0);
  }

  private native long GetGlobalIndexStart_26();
  public long GetGlobalIndexStart()
  {
    return GetGlobalIndexStart_26();
  }

  private native void SetGlobalIndexFromLocal_27(long id0,long id1);
  public void SetGlobalIndexFromLocal(long id0,long id1)
  {
    SetGlobalIndexFromLocal_27(id0,id1);
  }

  private native long GetGlobalIndexFromLocal_28(long id0);
  public long GetGlobalIndexFromLocal(long id0)
  {
    return GetGlobalIndexFromLocal_28(id0);
  }

  private native long GetGlobalNodeIndexMax_29();
  public long GetGlobalNodeIndexMax()
  {
    return GetGlobalNodeIndexMax_29();
  }

  private native boolean IsLeaf_30(long id0);
  public boolean IsLeaf(long id0)
  {
    return IsLeaf_30(id0);
  }

  private native void SubdivideLeaf_31(long id0,int id1);
  public void SubdivideLeaf(long id0,int id1)
  {
    SubdivideLeaf_31(id0,id1);
  }

  private native boolean IsTerminalNode_32(long id0);
  public boolean IsTerminalNode(long id0)
  {
    return IsTerminalNode_32(id0);
  }

  private native long GetElderChildIndex_33(int id0);
  public long GetElderChildIndex(int id0)
  {
    return GetElderChildIndex_33(id0);
  }

  private native boolean HasScales_34();
  public boolean HasScales()
  {
    return HasScales_34();
  }

  public vtkHyperTree() { super(); }

  public vtkHyperTree(long id) { super(id); }

}
