// java wrapper for vtkHyperTreeGrid object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkHyperTreeGrid extends vtkDataObject
{

  private native long LEVELS_0();
  public vtkInformationIntegerKey LEVELS()
  {
    long temp = LEVELS_0();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long DIMENSION_1();
  public vtkInformationIntegerKey DIMENSION()
  {
    long temp = DIMENSION_1();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ORIENTATION_2();
  public vtkInformationIntegerKey ORIENTATION()
  {
    long temp = ORIENTATION_2();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long SIZES_3();
  public vtkInformationDoubleVectorKey SIZES()
  {
    long temp = SIZES_3();

    if (temp == 0) return null;
    return (vtkInformationDoubleVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int IsTypeOf_4(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_4(bytes0, bytes0.length);
  }

  private native int IsA_5(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_5(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_6(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_6(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_7(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_7(bytes0, bytes0.length);
  }

  private native void SetModeSqueeze_8(byte[] id0, int len0);
  public void SetModeSqueeze(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetModeSqueeze_8(bytes0, bytes0.length);
  }

  private native byte[] GetModeSqueeze_9();
  public String GetModeSqueeze()
  {
    return new String(GetModeSqueeze_9(), StandardCharsets.UTF_8);
  }

  private native void Squeeze_10();
  public void Squeeze()
  {
    Squeeze_10();
  }

  private native int GetDataObjectType_11();
  public int GetDataObjectType()
  {
    return GetDataObjectType_11();
  }

  private native void CopyStructure_12(vtkDataObject id0);
  public void CopyStructure(vtkDataObject id0)
  {
    CopyStructure_12(id0);
  }

  private native void CopyEmptyStructure_13(vtkDataObject id0);
  public void CopyEmptyStructure(vtkDataObject id0)
  {
    CopyEmptyStructure_13(id0);
  }

  private native void SetDimensions_14(int id0[]);
  public void SetDimensions(int id0[])
  {
    SetDimensions_14(id0);
  }

  private native void SetDimensions_15(int id0,int id1,int id2);
  public void SetDimensions(int id0,int id1,int id2)
  {
    SetDimensions_15(id0,id1,id2);
  }

  private native void GetDimensions_16(int id0[]);
  public void GetDimensions(int id0[])
  {
    GetDimensions_16(id0);
  }

  private native void SetExtent_17(int id0[]);
  public void SetExtent(int id0[])
  {
    SetExtent_17(id0);
  }

  private native void SetExtent_18(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetExtent_18(id0,id1,id2,id3,id4,id5);
  }

  private native int[] GetExtent_19();
  public int[] GetExtent()
  {
    return GetExtent_19();
  }

  private native void GetCellDims_20(int id0[]);
  public void GetCellDims(int id0[])
  {
    GetCellDims_20(id0);
  }

  private native int GetDimension_21();
  public int GetDimension()
  {
    return GetDimension_21();
  }

  private native int GetNumberOfChildren_22();
  public int GetNumberOfChildren()
  {
    return GetNumberOfChildren_22();
  }

  private native void SetTransposedRootIndexing_23(boolean id0);
  public void SetTransposedRootIndexing(boolean id0)
  {
    SetTransposedRootIndexing_23(id0);
  }

  private native boolean GetTransposedRootIndexing_24();
  public boolean GetTransposedRootIndexing()
  {
    return GetTransposedRootIndexing_24();
  }

  private native void SetIndexingModeToKJI_25();
  public void SetIndexingModeToKJI()
  {
    SetIndexingModeToKJI_25();
  }

  private native void SetIndexingModeToIJK_26();
  public void SetIndexingModeToIJK()
  {
    SetIndexingModeToIJK_26();
  }

  private native int GetOrientation_27();
  public int GetOrientation()
  {
    return GetOrientation_27();
  }

  private native boolean GetFreezeState_28();
  public boolean GetFreezeState()
  {
    return GetFreezeState_28();
  }

  private native void SetBranchFactor_29(int id0);
  public void SetBranchFactor(int id0)
  {
    SetBranchFactor_29(id0);
  }

  private native int GetBranchFactor_30();
  public int GetBranchFactor()
  {
    return GetBranchFactor_30();
  }

  private native long GetMaxNumberOfTrees_31();
  public long GetMaxNumberOfTrees()
  {
    return GetMaxNumberOfTrees_31();
  }

  private native long GetNumberOfVertices_32();
  public long GetNumberOfVertices()
  {
    return GetNumberOfVertices_32();
  }

  private native long GetNumberOfNonEmptyTrees_33();
  public long GetNumberOfNonEmptyTrees()
  {
    return GetNumberOfNonEmptyTrees_33();
  }

  private native long GetNumberOfLeaves_34();
  public long GetNumberOfLeaves()
  {
    return GetNumberOfLeaves_34();
  }

  private native int GetNumberOfLevels_35(long id0);
  public int GetNumberOfLevels(long id0)
  {
    return GetNumberOfLevels_35(id0);
  }

  private native int GetNumberOfLevels_36();
  public int GetNumberOfLevels()
  {
    return GetNumberOfLevels_36();
  }

  private native void SetXCoordinates_37(vtkDataArray id0);
  public void SetXCoordinates(vtkDataArray id0)
  {
    SetXCoordinates_37(id0);
  }

  private native long GetXCoordinates_38();
  public vtkDataArray GetXCoordinates()
  {
    long temp = GetXCoordinates_38();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetYCoordinates_39(vtkDataArray id0);
  public void SetYCoordinates(vtkDataArray id0)
  {
    SetYCoordinates_39(id0);
  }

  private native long GetYCoordinates_40();
  public vtkDataArray GetYCoordinates()
  {
    long temp = GetYCoordinates_40();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetZCoordinates_41(vtkDataArray id0);
  public void SetZCoordinates(vtkDataArray id0)
  {
    SetZCoordinates_41(id0);
  }

  private native long GetZCoordinates_42();
  public vtkDataArray GetZCoordinates()
  {
    long temp = GetZCoordinates_42();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CopyCoordinates_43(vtkHyperTreeGrid id0);
  public void CopyCoordinates(vtkHyperTreeGrid id0)
  {
    CopyCoordinates_43(id0);
  }

  private native void SetFixedCoordinates_44(int id0,double id1);
  public void SetFixedCoordinates(int id0,double id1)
  {
    SetFixedCoordinates_44(id0,id1);
  }

  private native void SetMask_45(vtkBitArray id0);
  public void SetMask(vtkBitArray id0)
  {
    SetMask_45(id0);
  }

  private native long GetMask_46();
  public vtkBitArray GetMask()
  {
    long temp = GetMask_46();

    if (temp == 0) return null;
    return (vtkBitArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean HasMask_47();
  public boolean HasMask()
  {
    return HasMask_47();
  }

  private native void SetHasInterface_48(boolean id0);
  public void SetHasInterface(boolean id0)
  {
    SetHasInterface_48(id0);
  }

  private native boolean GetHasInterface_49();
  public boolean GetHasInterface()
  {
    return GetHasInterface_49();
  }

  private native void HasInterfaceOn_50();
  public void HasInterfaceOn()
  {
    HasInterfaceOn_50();
  }

  private native void HasInterfaceOff_51();
  public void HasInterfaceOff()
  {
    HasInterfaceOff_51();
  }

  private native void SetInterfaceNormalsName_52(byte[] id0, int len0);
  public void SetInterfaceNormalsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInterfaceNormalsName_52(bytes0, bytes0.length);
  }

  private native byte[] GetInterfaceNormalsName_53();
  public String GetInterfaceNormalsName()
  {
    return new String(GetInterfaceNormalsName_53(), StandardCharsets.UTF_8);
  }

  private native void SetInterfaceInterceptsName_54(byte[] id0, int len0);
  public void SetInterfaceInterceptsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInterfaceInterceptsName_54(bytes0, bytes0.length);
  }

  private native byte[] GetInterfaceInterceptsName_55();
  public String GetInterfaceInterceptsName()
  {
    return new String(GetInterfaceInterceptsName_55(), StandardCharsets.UTF_8);
  }

  private native void SetDepthLimiter_56(int id0);
  public void SetDepthLimiter(int id0)
  {
    SetDepthLimiter_56(id0);
  }

  private native int GetDepthLimiter_57();
  public int GetDepthLimiter()
  {
    return GetDepthLimiter_57();
  }

  private native void InitializeOrientedCursor_58(vtkHyperTreeGridOrientedCursor id0,long id1,boolean id2);
  public void InitializeOrientedCursor(vtkHyperTreeGridOrientedCursor id0,long id1,boolean id2)
  {
    InitializeOrientedCursor_58(id0,id1,id2);
  }

  private native long NewOrientedCursor_59(long id0,boolean id1);
  public vtkHyperTreeGridOrientedCursor NewOrientedCursor(long id0,boolean id1)
  {
    long temp = NewOrientedCursor_59(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTreeGridOrientedCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void InitializeOrientedGeometryCursor_60(vtkHyperTreeGridOrientedGeometryCursor id0,long id1,boolean id2);
  public void InitializeOrientedGeometryCursor(vtkHyperTreeGridOrientedGeometryCursor id0,long id1,boolean id2)
  {
    InitializeOrientedGeometryCursor_60(id0,id1,id2);
  }

  private native long NewOrientedGeometryCursor_61(long id0,boolean id1);
  public vtkHyperTreeGridOrientedGeometryCursor NewOrientedGeometryCursor(long id0,boolean id1)
  {
    long temp = NewOrientedGeometryCursor_61(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTreeGridOrientedGeometryCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void InitializeNonOrientedCursor_62(vtkHyperTreeGridNonOrientedCursor id0,long id1,boolean id2);
  public void InitializeNonOrientedCursor(vtkHyperTreeGridNonOrientedCursor id0,long id1,boolean id2)
  {
    InitializeNonOrientedCursor_62(id0,id1,id2);
  }

  private native long NewNonOrientedCursor_63(long id0,boolean id1);
  public vtkHyperTreeGridNonOrientedCursor NewNonOrientedCursor(long id0,boolean id1)
  {
    long temp = NewNonOrientedCursor_63(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTreeGridNonOrientedCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void InitializeNonOrientedGeometryCursor_64(vtkHyperTreeGridNonOrientedGeometryCursor id0,long id1,boolean id2);
  public void InitializeNonOrientedGeometryCursor(vtkHyperTreeGridNonOrientedGeometryCursor id0,long id1,boolean id2)
  {
    InitializeNonOrientedGeometryCursor_64(id0,id1,id2);
  }

  private native long NewNonOrientedGeometryCursor_65(long id0,boolean id1);
  public vtkHyperTreeGridNonOrientedGeometryCursor NewNonOrientedGeometryCursor(long id0,boolean id1)
  {
    long temp = NewNonOrientedGeometryCursor_65(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTreeGridNonOrientedGeometryCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void InitializeNonOrientedUnlimitedGeometryCursor_66(vtkHyperTreeGridNonOrientedUnlimitedGeometryCursor id0,long id1,boolean id2);
  public void InitializeNonOrientedUnlimitedGeometryCursor(vtkHyperTreeGridNonOrientedUnlimitedGeometryCursor id0,long id1,boolean id2)
  {
    InitializeNonOrientedUnlimitedGeometryCursor_66(id0,id1,id2);
  }

  private native long NewNonOrientedUnlimitedGeometryCursor_67(long id0,boolean id1);
  public vtkHyperTreeGridNonOrientedUnlimitedGeometryCursor NewNonOrientedUnlimitedGeometryCursor(long id0,boolean id1)
  {
    long temp = NewNonOrientedUnlimitedGeometryCursor_67(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTreeGridNonOrientedUnlimitedGeometryCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long FindNonOrientedGeometryCursor_68(double id0[]);
  public vtkHyperTreeGridNonOrientedGeometryCursor FindNonOrientedGeometryCursor(double id0[])
  {
    long temp = FindNonOrientedGeometryCursor_68(id0);

    if (temp == 0) return null;
    return (vtkHyperTreeGridNonOrientedGeometryCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int FindDichotomicX_69(double id0,double id1);
  public int FindDichotomicX(double id0,double id1)
  {
    return FindDichotomicX_69(id0,id1);
  }

  private native int FindDichotomicY_70(double id0,double id1);
  public int FindDichotomicY(double id0,double id1)
  {
    return FindDichotomicY_70(id0,id1);
  }

  private native int FindDichotomicZ_71(double id0,double id1);
  public int FindDichotomicZ(double id0,double id1)
  {
    return FindDichotomicZ_71(id0,id1);
  }

  private native void InitializeNonOrientedVonNeumannSuperCursor_72(vtkHyperTreeGridNonOrientedVonNeumannSuperCursor id0,long id1,boolean id2);
  public void InitializeNonOrientedVonNeumannSuperCursor(vtkHyperTreeGridNonOrientedVonNeumannSuperCursor id0,long id1,boolean id2)
  {
    InitializeNonOrientedVonNeumannSuperCursor_72(id0,id1,id2);
  }

  private native long NewNonOrientedVonNeumannSuperCursor_73(long id0,boolean id1);
  public vtkHyperTreeGridNonOrientedVonNeumannSuperCursor NewNonOrientedVonNeumannSuperCursor(long id0,boolean id1)
  {
    long temp = NewNonOrientedVonNeumannSuperCursor_73(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTreeGridNonOrientedVonNeumannSuperCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void InitializeNonOrientedVonNeumannSuperCursorLight_74(vtkHyperTreeGridNonOrientedVonNeumannSuperCursorLight id0,long id1,boolean id2);
  public void InitializeNonOrientedVonNeumannSuperCursorLight(vtkHyperTreeGridNonOrientedVonNeumannSuperCursorLight id0,long id1,boolean id2)
  {
    InitializeNonOrientedVonNeumannSuperCursorLight_74(id0,id1,id2);
  }

  private native long NewNonOrientedVonNeumannSuperCursorLight_75(long id0,boolean id1);
  public vtkHyperTreeGridNonOrientedVonNeumannSuperCursorLight NewNonOrientedVonNeumannSuperCursorLight(long id0,boolean id1)
  {
    long temp = NewNonOrientedVonNeumannSuperCursorLight_75(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTreeGridNonOrientedVonNeumannSuperCursorLight)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void InitializeNonOrientedMooreSuperCursor_76(vtkHyperTreeGridNonOrientedMooreSuperCursor id0,long id1,boolean id2);
  public void InitializeNonOrientedMooreSuperCursor(vtkHyperTreeGridNonOrientedMooreSuperCursor id0,long id1,boolean id2)
  {
    InitializeNonOrientedMooreSuperCursor_76(id0,id1,id2);
  }

  private native long NewNonOrientedMooreSuperCursor_77(long id0,boolean id1);
  public vtkHyperTreeGridNonOrientedMooreSuperCursor NewNonOrientedMooreSuperCursor(long id0,boolean id1)
  {
    long temp = NewNonOrientedMooreSuperCursor_77(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTreeGridNonOrientedMooreSuperCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void InitializeNonOrientedMooreSuperCursorLight_78(vtkHyperTreeGridNonOrientedMooreSuperCursorLight id0,long id1,boolean id2);
  public void InitializeNonOrientedMooreSuperCursorLight(vtkHyperTreeGridNonOrientedMooreSuperCursorLight id0,long id1,boolean id2)
  {
    InitializeNonOrientedMooreSuperCursorLight_78(id0,id1,id2);
  }

  private native long NewNonOrientedMooreSuperCursorLight_79(long id0,boolean id1);
  public vtkHyperTreeGridNonOrientedMooreSuperCursorLight NewNonOrientedMooreSuperCursorLight(long id0,boolean id1)
  {
    long temp = NewNonOrientedMooreSuperCursorLight_79(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTreeGridNonOrientedMooreSuperCursorLight)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void InitializeNonOrientedUnlimitedMooreSuperCursor_80(vtkHyperTreeGridNonOrientedUnlimitedMooreSuperCursor id0,long id1,boolean id2);
  public void InitializeNonOrientedUnlimitedMooreSuperCursor(vtkHyperTreeGridNonOrientedUnlimitedMooreSuperCursor id0,long id1,boolean id2)
  {
    InitializeNonOrientedUnlimitedMooreSuperCursor_80(id0,id1,id2);
  }

  private native long NewNonOrientedUnlimitedMooreSuperCursor_81(long id0,boolean id1);
  public vtkHyperTreeGridNonOrientedUnlimitedMooreSuperCursor NewNonOrientedUnlimitedMooreSuperCursor(long id0,boolean id1)
  {
    long temp = NewNonOrientedUnlimitedMooreSuperCursor_81(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTreeGridNonOrientedUnlimitedMooreSuperCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Initialize_82();
  public void Initialize()
  {
    Initialize_82();
  }

  private native long GetTree_83(long id0,boolean id1);
  public vtkHyperTree GetTree(long id0,boolean id1)
  {
    long temp = GetTree_83(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTree_84(long id0,vtkHyperTree id1);
  public void SetTree(long id0,vtkHyperTree id1)
  {
    SetTree_84(id0,id1);
  }

  private native void ShallowCopy_85(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_85(id0);
  }

  private native void DeepCopy_86(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_86(id0);
  }

  private native int GetExtentType_87();
  public int GetExtentType()
  {
    return GetExtentType_87();
  }

  private native long GetActualMemorySizeBytes_88();
  public long GetActualMemorySizeBytes()
  {
    return GetActualMemorySizeBytes_88();
  }

  private native long GetActualMemorySize_89();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_89();
  }

  private native boolean SupportsGhostArray_90(int id0);
  public boolean SupportsGhostArray(int id0)
  {
    return SupportsGhostArray_90(id0);
  }

  private native long GetPureMask_91();
  public vtkBitArray GetPureMask()
  {
    long temp = GetPureMask_91();

    if (temp == 0) return null;
    return (vtkBitArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetChildMask_92(int id0);
  public int GetChildMask(int id0)
  {
    return GetChildMask_92(id0);
  }

  private native long GetShiftedLevelZeroIndex_93(long id0,int id1,int id2,int id3);
  public long GetShiftedLevelZeroIndex(long id0,int id1,int id2,int id3)
  {
    return GetShiftedLevelZeroIndex_93(id0,id1,id2,id3);
  }

  private native long GetGlobalNodeIndexMax_94();
  public long GetGlobalNodeIndexMax()
  {
    return GetGlobalNodeIndexMax_94();
  }

  private native void InitializeLocalIndexNode_95();
  public void InitializeLocalIndexNode()
  {
    InitializeLocalIndexNode_95();
  }

  private native boolean HasAnyGhostCells_96();
  public boolean HasAnyGhostCells()
  {
    return HasAnyGhostCells_96();
  }

  private native long GetGhostCells_97();
  public vtkUnsignedCharArray GetGhostCells()
  {
    long temp = GetGhostCells_97();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTreeGhostArray_98();
  public vtkUnsignedCharArray GetTreeGhostArray()
  {
    long temp = GetTreeGhostArray_98();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long AllocateTreeGhostArray_99();
  public vtkUnsignedCharArray AllocateTreeGhostArray()
  {
    long temp = AllocateTreeGhostArray_99();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_100(vtkInformation id0);
  public vtkHyperTreeGrid GetData(vtkInformation id0)
  {
    long temp = GetData_100(id0);

    if (temp == 0) return null;
    return (vtkHyperTreeGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_101(vtkInformationVector id0,int id1);
  public vtkHyperTreeGrid GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_101(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTreeGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native double[] GetBounds_102();
  public double[] GetBounds()
  {
    return GetBounds_102();
  }

  private native void GetBounds_103(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_103(id0);
  }

  private native double[] GetCenter_104();
  public double[] GetCenter()
  {
    return GetCenter_104();
  }

  private native void GetCenter_105(double id0[]);
  public void GetCenter(double id0[])
  {
    GetCenter_105(id0);
  }

  private native long GetCellData_106();
  public vtkCellData GetCellData()
  {
    long temp = GetCellData_106();

    if (temp == 0) return null;
    return (vtkCellData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAttributesAsFieldData_107(int id0);
  public vtkFieldData GetAttributesAsFieldData(int id0)
  {
    long temp = GetAttributesAsFieldData_107(id0);

    if (temp == 0) return null;
    return (vtkFieldData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNumberOfElements_108(int id0);
  public long GetNumberOfElements(int id0)
  {
    return GetNumberOfElements_108(id0);
  }

  private native long GetNumberOfCells_109();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_109();
  }

  public vtkHyperTreeGrid() { super(); }

  public vtkHyperTreeGrid(long id) { super(id); }
  public native long   VTKInit();

}
