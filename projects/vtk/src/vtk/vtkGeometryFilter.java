// java wrapper for vtkGeometryFilter object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkGeometryFilter extends vtkPolyDataAlgorithm
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

  private native void SetPointClipping_4(boolean id0);
  public void SetPointClipping(boolean id0)
  {
    SetPointClipping_4(id0);
  }

  private native boolean GetPointClipping_5();
  public boolean GetPointClipping()
  {
    return GetPointClipping_5();
  }

  private native void PointClippingOn_6();
  public void PointClippingOn()
  {
    PointClippingOn_6();
  }

  private native void PointClippingOff_7();
  public void PointClippingOff()
  {
    PointClippingOff_7();
  }

  private native void SetCellClipping_8(boolean id0);
  public void SetCellClipping(boolean id0)
  {
    SetCellClipping_8(id0);
  }

  private native boolean GetCellClipping_9();
  public boolean GetCellClipping()
  {
    return GetCellClipping_9();
  }

  private native void CellClippingOn_10();
  public void CellClippingOn()
  {
    CellClippingOn_10();
  }

  private native void CellClippingOff_11();
  public void CellClippingOff()
  {
    CellClippingOff_11();
  }

  private native void SetExtentClipping_12(boolean id0);
  public void SetExtentClipping(boolean id0)
  {
    SetExtentClipping_12(id0);
  }

  private native boolean GetExtentClipping_13();
  public boolean GetExtentClipping()
  {
    return GetExtentClipping_13();
  }

  private native void ExtentClippingOn_14();
  public void ExtentClippingOn()
  {
    ExtentClippingOn_14();
  }

  private native void ExtentClippingOff_15();
  public void ExtentClippingOff()
  {
    ExtentClippingOff_15();
  }

  private native void SetPointMinimum_16(long id0);
  public void SetPointMinimum(long id0)
  {
    SetPointMinimum_16(id0);
  }

  private native long GetPointMinimumMinValue_17();
  public long GetPointMinimumMinValue()
  {
    return GetPointMinimumMinValue_17();
  }

  private native long GetPointMinimumMaxValue_18();
  public long GetPointMinimumMaxValue()
  {
    return GetPointMinimumMaxValue_18();
  }

  private native long GetPointMinimum_19();
  public long GetPointMinimum()
  {
    return GetPointMinimum_19();
  }

  private native void SetPointMaximum_20(long id0);
  public void SetPointMaximum(long id0)
  {
    SetPointMaximum_20(id0);
  }

  private native long GetPointMaximumMinValue_21();
  public long GetPointMaximumMinValue()
  {
    return GetPointMaximumMinValue_21();
  }

  private native long GetPointMaximumMaxValue_22();
  public long GetPointMaximumMaxValue()
  {
    return GetPointMaximumMaxValue_22();
  }

  private native long GetPointMaximum_23();
  public long GetPointMaximum()
  {
    return GetPointMaximum_23();
  }

  private native void SetCellMinimum_24(long id0);
  public void SetCellMinimum(long id0)
  {
    SetCellMinimum_24(id0);
  }

  private native long GetCellMinimumMinValue_25();
  public long GetCellMinimumMinValue()
  {
    return GetCellMinimumMinValue_25();
  }

  private native long GetCellMinimumMaxValue_26();
  public long GetCellMinimumMaxValue()
  {
    return GetCellMinimumMaxValue_26();
  }

  private native long GetCellMinimum_27();
  public long GetCellMinimum()
  {
    return GetCellMinimum_27();
  }

  private native void SetCellMaximum_28(long id0);
  public void SetCellMaximum(long id0)
  {
    SetCellMaximum_28(id0);
  }

  private native long GetCellMaximumMinValue_29();
  public long GetCellMaximumMinValue()
  {
    return GetCellMaximumMinValue_29();
  }

  private native long GetCellMaximumMaxValue_30();
  public long GetCellMaximumMaxValue()
  {
    return GetCellMaximumMaxValue_30();
  }

  private native long GetCellMaximum_31();
  public long GetCellMaximum()
  {
    return GetCellMaximum_31();
  }

  private native void SetExtent_32(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetExtent(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetExtent_32(id0,id1,id2,id3,id4,id5);
  }

  private native void SetExtent_33(double id0[]);
  public void SetExtent(double id0[])
  {
    SetExtent_33(id0);
  }

  private native double[] GetExtent_34();
  public double[] GetExtent()
  {
    return GetExtent_34();
  }

  private native void SetMerging_35(boolean id0);
  public void SetMerging(boolean id0)
  {
    SetMerging_35(id0);
  }

  private native boolean GetMerging_36();
  public boolean GetMerging()
  {
    return GetMerging_36();
  }

  private native void MergingOn_37();
  public void MergingOn()
  {
    MergingOn_37();
  }

  private native void MergingOff_38();
  public void MergingOff()
  {
    MergingOff_38();
  }

  private native void SetOutputPointsPrecision_39(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_39(id0);
  }

  private native int GetOutputPointsPrecision_40();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_40();
  }

  private native void SetFastMode_41(boolean id0);
  public void SetFastMode(boolean id0)
  {
    SetFastMode_41(id0);
  }

  private native boolean GetFastMode_42();
  public boolean GetFastMode()
  {
    return GetFastMode_42();
  }

  private native void FastModeOn_43();
  public void FastModeOn()
  {
    FastModeOn_43();
  }

  private native void FastModeOff_44();
  public void FastModeOff()
  {
    FastModeOff_44();
  }

  private native void SetDegree_45(int id0);
  public void SetDegree(int id0)
  {
    SetDegree_45(id0);
  }

  private native int GetDegreeMinValue_46();
  public int GetDegreeMinValue()
  {
    return GetDegreeMinValue_46();
  }

  private native int GetDegreeMaxValue_47();
  public int GetDegreeMaxValue()
  {
    return GetDegreeMaxValue_47();
  }

  private native int GetDegree_48();
  public int GetDegree()
  {
    return GetDegree_48();
  }

  private native void SetLocator_49(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_49(id0);
  }

  private native long GetLocator_50();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_50();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLocator_51();
  public void CreateDefaultLocator()
  {
    CreateDefaultLocator_51();
  }

  private native void SetPieceInvariant_52(int id0);
  public void SetPieceInvariant(int id0)
  {
    SetPieceInvariant_52(id0);
  }

  private native int GetPieceInvariant_53();
  public int GetPieceInvariant()
  {
    return GetPieceInvariant_53();
  }

  private native void SetPassThroughCellIds_54(int id0);
  public void SetPassThroughCellIds(int id0)
  {
    SetPassThroughCellIds_54(id0);
  }

  private native int GetPassThroughCellIds_55();
  public int GetPassThroughCellIds()
  {
    return GetPassThroughCellIds_55();
  }

  private native void PassThroughCellIdsOn_56();
  public void PassThroughCellIdsOn()
  {
    PassThroughCellIdsOn_56();
  }

  private native void PassThroughCellIdsOff_57();
  public void PassThroughCellIdsOff()
  {
    PassThroughCellIdsOff_57();
  }

  private native void SetPassThroughPointIds_58(int id0);
  public void SetPassThroughPointIds(int id0)
  {
    SetPassThroughPointIds_58(id0);
  }

  private native int GetPassThroughPointIds_59();
  public int GetPassThroughPointIds()
  {
    return GetPassThroughPointIds_59();
  }

  private native void PassThroughPointIdsOn_60();
  public void PassThroughPointIdsOn()
  {
    PassThroughPointIdsOn_60();
  }

  private native void PassThroughPointIdsOff_61();
  public void PassThroughPointIdsOff()
  {
    PassThroughPointIdsOff_61();
  }

  private native void SetOriginalCellIdsName_62(byte[] id0, int len0);
  public void SetOriginalCellIdsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOriginalCellIdsName_62(bytes0, bytes0.length);
  }

  private native byte[] GetOriginalCellIdsName_63();
  public String GetOriginalCellIdsName()
  {
    return new String(GetOriginalCellIdsName_63(), StandardCharsets.UTF_8);
  }

  private native void SetOriginalPointIdsName_64(byte[] id0, int len0);
  public void SetOriginalPointIdsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOriginalPointIdsName_64(bytes0, bytes0.length);
  }

  private native byte[] GetOriginalPointIdsName_65();
  public String GetOriginalPointIdsName()
  {
    return new String(GetOriginalPointIdsName_65(), StandardCharsets.UTF_8);
  }

  private native void SetExcludedFacesData_66(vtkPolyData id0);
  public void SetExcludedFacesData(vtkPolyData id0)
  {
    SetExcludedFacesData_66(id0);
  }

  private native void SetExcludedFacesConnection_67(vtkAlgorithmOutput id0);
  public void SetExcludedFacesConnection(vtkAlgorithmOutput id0)
  {
    SetExcludedFacesConnection_67(id0);
  }

  private native long GetExcludedFaces_68();
  public vtkPolyData GetExcludedFaces()
  {
    long temp = GetExcludedFaces_68();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetNonlinearSubdivisionLevel_69(int id0);
  public void SetNonlinearSubdivisionLevel(int id0)
  {
    SetNonlinearSubdivisionLevel_69(id0);
  }

  private native int GetNonlinearSubdivisionLevel_70();
  public int GetNonlinearSubdivisionLevel()
  {
    return GetNonlinearSubdivisionLevel_70();
  }

  private native void SetMatchBoundariesIgnoringCellOrder_71(int id0);
  public void SetMatchBoundariesIgnoringCellOrder(int id0)
  {
    SetMatchBoundariesIgnoringCellOrder_71(id0);
  }

  private native int GetMatchBoundariesIgnoringCellOrder_72();
  public int GetMatchBoundariesIgnoringCellOrder()
  {
    return GetMatchBoundariesIgnoringCellOrder_72();
  }

  private native void SetDelegation_73(int id0);
  public void SetDelegation(int id0)
  {
    SetDelegation_73(id0);
  }

  private native int GetDelegation_74();
  public int GetDelegation()
  {
    return GetDelegation_74();
  }

  private native void DelegationOn_75();
  public void DelegationOn()
  {
    DelegationOn_75();
  }

  private native void DelegationOff_76();
  public void DelegationOff()
  {
    DelegationOff_76();
  }

  private native void SetRemoveGhostInterfaces_77(boolean id0);
  public void SetRemoveGhostInterfaces(boolean id0)
  {
    SetRemoveGhostInterfaces_77(id0);
  }

  private native void RemoveGhostInterfacesOn_78();
  public void RemoveGhostInterfacesOn()
  {
    RemoveGhostInterfacesOn_78();
  }

  private native void RemoveGhostInterfacesOff_79();
  public void RemoveGhostInterfacesOff()
  {
    RemoveGhostInterfacesOff_79();
  }

  private native boolean GetRemoveGhostInterfaces_80();
  public boolean GetRemoveGhostInterfaces()
  {
    return GetRemoveGhostInterfaces_80();
  }

  private native int PolyDataExecute_81(vtkDataSet id0,vtkPolyData id1,vtkPolyData id2);
  public int PolyDataExecute(vtkDataSet id0,vtkPolyData id1,vtkPolyData id2)
  {
    return PolyDataExecute_81(id0,id1,id2);
  }

  private native int PolyDataExecute_82(vtkDataSet id0,vtkPolyData id1);
  public int PolyDataExecute(vtkDataSet id0,vtkPolyData id1)
  {
    return PolyDataExecute_82(id0,id1);
  }

  private native int UnstructuredGridExecute_83(vtkDataSet id0,vtkPolyData id1);
  public int UnstructuredGridExecute(vtkDataSet id0,vtkPolyData id1)
  {
    return UnstructuredGridExecute_83(id0,id1);
  }

  private native int DataSetExecute_84(vtkDataSet id0,vtkPolyData id1,vtkPolyData id2);
  public int DataSetExecute(vtkDataSet id0,vtkPolyData id1,vtkPolyData id2)
  {
    return DataSetExecute_84(id0,id1,id2);
  }

  private native int DataSetExecute_85(vtkDataSet id0,vtkPolyData id1);
  public int DataSetExecute(vtkDataSet id0,vtkPolyData id1)
  {
    return DataSetExecute_85(id0,id1);
  }

  public vtkGeometryFilter() { super(); }

  public vtkGeometryFilter(long id) { super(id); }
  public native long   VTKInit();

}
