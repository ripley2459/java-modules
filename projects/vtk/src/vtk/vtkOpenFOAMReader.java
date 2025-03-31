// java wrapper for vtkOpenFOAMReader object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkOpenFOAMReader extends vtkMultiBlockDataSetAlgorithm
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

  private native int CanReadFile_4(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_4(bytes0, bytes0.length);
  }

  private native void SetFileName_5(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_5(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_6();
  public String GetFileName()
  {
    return new String(GetFileName_6(), StandardCharsets.UTF_8);
  }

  private native int GetNumberOfCellArrays_7();
  public int GetNumberOfCellArrays()
  {
    return GetNumberOfCellArrays_7();
  }

  private native int GetCellArrayStatus_8(byte[] id0, int len0);
  public int GetCellArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetCellArrayStatus_8(bytes0, bytes0.length);
  }

  private native void SetCellArrayStatus_9(byte[] id0, int len0,int id1);
  public void SetCellArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellArrayStatus_9(bytes0, bytes0.length,id1);
  }

  private native byte[] GetCellArrayName_10(int id0);
  public String GetCellArrayName(int id0)
  {
    return new String(GetCellArrayName_10(id0), StandardCharsets.UTF_8);
  }

  private native void DisableAllCellArrays_11();
  public void DisableAllCellArrays()
  {
    DisableAllCellArrays_11();
  }

  private native void EnableAllCellArrays_12();
  public void EnableAllCellArrays()
  {
    EnableAllCellArrays_12();
  }

  private native int GetNumberOfPointArrays_13();
  public int GetNumberOfPointArrays()
  {
    return GetNumberOfPointArrays_13();
  }

  private native int GetPointArrayStatus_14(byte[] id0, int len0);
  public int GetPointArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetPointArrayStatus_14(bytes0, bytes0.length);
  }

  private native void SetPointArrayStatus_15(byte[] id0, int len0,int id1);
  public void SetPointArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPointArrayStatus_15(bytes0, bytes0.length,id1);
  }

  private native byte[] GetPointArrayName_16(int id0);
  public String GetPointArrayName(int id0)
  {
    return new String(GetPointArrayName_16(id0), StandardCharsets.UTF_8);
  }

  private native void DisableAllPointArrays_17();
  public void DisableAllPointArrays()
  {
    DisableAllPointArrays_17();
  }

  private native void EnableAllPointArrays_18();
  public void EnableAllPointArrays()
  {
    EnableAllPointArrays_18();
  }

  private native int GetNumberOfLagrangianArrays_19();
  public int GetNumberOfLagrangianArrays()
  {
    return GetNumberOfLagrangianArrays_19();
  }

  private native int GetLagrangianArrayStatus_20(byte[] id0, int len0);
  public int GetLagrangianArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetLagrangianArrayStatus_20(bytes0, bytes0.length);
  }

  private native void SetLagrangianArrayStatus_21(byte[] id0, int len0,int id1);
  public void SetLagrangianArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLagrangianArrayStatus_21(bytes0, bytes0.length,id1);
  }

  private native byte[] GetLagrangianArrayName_22(int id0);
  public String GetLagrangianArrayName(int id0)
  {
    return new String(GetLagrangianArrayName_22(id0), StandardCharsets.UTF_8);
  }

  private native void DisableAllLagrangianArrays_23();
  public void DisableAllLagrangianArrays()
  {
    DisableAllLagrangianArrays_23();
  }

  private native void EnableAllLagrangianArrays_24();
  public void EnableAllLagrangianArrays()
  {
    EnableAllLagrangianArrays_24();
  }

  private native int GetNumberOfPatchArrays_25();
  public int GetNumberOfPatchArrays()
  {
    return GetNumberOfPatchArrays_25();
  }

  private native int GetPatchArrayStatus_26(byte[] id0, int len0);
  public int GetPatchArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetPatchArrayStatus_26(bytes0, bytes0.length);
  }

  private native void SetPatchArrayStatus_27(byte[] id0, int len0,int id1);
  public void SetPatchArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPatchArrayStatus_27(bytes0, bytes0.length,id1);
  }

  private native byte[] GetPatchArrayName_28(int id0);
  public String GetPatchArrayName(int id0)
  {
    return new String(GetPatchArrayName_28(id0), StandardCharsets.UTF_8);
  }

  private native void DisableAllPatchArrays_29();
  public void DisableAllPatchArrays()
  {
    DisableAllPatchArrays_29();
  }

  private native void EnableAllPatchArrays_30();
  public void EnableAllPatchArrays()
  {
    EnableAllPatchArrays_30();
  }

  private native void SetCreateCellToPoint_31(int id0);
  public void SetCreateCellToPoint(int id0)
  {
    SetCreateCellToPoint_31(id0);
  }

  private native int GetCreateCellToPoint_32();
  public int GetCreateCellToPoint()
  {
    return GetCreateCellToPoint_32();
  }

  private native void CreateCellToPointOn_33();
  public void CreateCellToPointOn()
  {
    CreateCellToPointOn_33();
  }

  private native void CreateCellToPointOff_34();
  public void CreateCellToPointOff()
  {
    CreateCellToPointOff_34();
  }

  private native void SetSizeAverageCellToPoint_35(int id0);
  public void SetSizeAverageCellToPoint(int id0)
  {
    SetSizeAverageCellToPoint_35(id0);
  }

  private native int GetSizeAverageCellToPoint_36();
  public int GetSizeAverageCellToPoint()
  {
    return GetSizeAverageCellToPoint_36();
  }

  private native void SizeAverageCellToPointOn_37();
  public void SizeAverageCellToPointOn()
  {
    SizeAverageCellToPointOn_37();
  }

  private native void SizeAverageCellToPointOff_38();
  public void SizeAverageCellToPointOff()
  {
    SizeAverageCellToPointOff_38();
  }

  private native void SetCacheMesh_39(int id0);
  public void SetCacheMesh(int id0)
  {
    SetCacheMesh_39(id0);
  }

  private native int GetCacheMesh_40();
  public int GetCacheMesh()
  {
    return GetCacheMesh_40();
  }

  private native void CacheMeshOn_41();
  public void CacheMeshOn()
  {
    CacheMeshOn_41();
  }

  private native void CacheMeshOff_42();
  public void CacheMeshOff()
  {
    CacheMeshOff_42();
  }

  private native void SetDecomposePolyhedra_43(int id0);
  public void SetDecomposePolyhedra(int id0)
  {
    SetDecomposePolyhedra_43(id0);
  }

  private native int GetDecomposePolyhedra_44();
  public int GetDecomposePolyhedra()
  {
    return GetDecomposePolyhedra_44();
  }

  private native void DecomposePolyhedraOn_45();
  public void DecomposePolyhedraOn()
  {
    DecomposePolyhedraOn_45();
  }

  private native void DecomposePolyhedraOff_46();
  public void DecomposePolyhedraOff()
  {
    DecomposePolyhedraOff_46();
  }

  private native void SetPositionsIsIn13Format_47(int id0);
  public void SetPositionsIsIn13Format(int id0)
  {
    SetPositionsIsIn13Format_47(id0);
  }

  private native int GetPositionsIsIn13Format_48();
  public int GetPositionsIsIn13Format()
  {
    return GetPositionsIsIn13Format_48();
  }

  private native void PositionsIsIn13FormatOn_49();
  public void PositionsIsIn13FormatOn()
  {
    PositionsIsIn13FormatOn_49();
  }

  private native void PositionsIsIn13FormatOff_50();
  public void PositionsIsIn13FormatOff()
  {
    PositionsIsIn13FormatOff_50();
  }

  private native void SetSkipZeroTime_51(boolean id0);
  public void SetSkipZeroTime(boolean id0)
  {
    SetSkipZeroTime_51(id0);
  }

  private native boolean GetSkipZeroTime_52();
  public boolean GetSkipZeroTime()
  {
    return GetSkipZeroTime_52();
  }

  private native void SkipZeroTimeOn_53();
  public void SkipZeroTimeOn()
  {
    SkipZeroTimeOn_53();
  }

  private native void SkipZeroTimeOff_54();
  public void SkipZeroTimeOff()
  {
    SkipZeroTimeOff_54();
  }

  private native void SetListTimeStepsByControlDict_55(int id0);
  public void SetListTimeStepsByControlDict(int id0)
  {
    SetListTimeStepsByControlDict_55(id0);
  }

  private native int GetListTimeStepsByControlDict_56();
  public int GetListTimeStepsByControlDict()
  {
    return GetListTimeStepsByControlDict_56();
  }

  private native void ListTimeStepsByControlDictOn_57();
  public void ListTimeStepsByControlDictOn()
  {
    ListTimeStepsByControlDictOn_57();
  }

  private native void ListTimeStepsByControlDictOff_58();
  public void ListTimeStepsByControlDictOff()
  {
    ListTimeStepsByControlDictOff_58();
  }

  private native void SetAddDimensionsToArrayNames_59(int id0);
  public void SetAddDimensionsToArrayNames(int id0)
  {
    SetAddDimensionsToArrayNames_59(id0);
  }

  private native int GetAddDimensionsToArrayNames_60();
  public int GetAddDimensionsToArrayNames()
  {
    return GetAddDimensionsToArrayNames_60();
  }

  private native void AddDimensionsToArrayNamesOn_61();
  public void AddDimensionsToArrayNamesOn()
  {
    AddDimensionsToArrayNamesOn_61();
  }

  private native void AddDimensionsToArrayNamesOff_62();
  public void AddDimensionsToArrayNamesOff()
  {
    AddDimensionsToArrayNamesOff_62();
  }

  private native void SetReadZones_63(int id0);
  public void SetReadZones(int id0)
  {
    SetReadZones_63(id0);
  }

  private native int GetReadZones_64();
  public int GetReadZones()
  {
    return GetReadZones_64();
  }

  private native void ReadZonesOn_65();
  public void ReadZonesOn()
  {
    ReadZonesOn_65();
  }

  private native void ReadZonesOff_66();
  public void ReadZonesOff()
  {
    ReadZonesOff_66();
  }

  private native void SetUse64BitLabels_67(boolean id0);
  public void SetUse64BitLabels(boolean id0)
  {
    SetUse64BitLabels_67(id0);
  }

  private native boolean GetUse64BitLabels_68();
  public boolean GetUse64BitLabels()
  {
    return GetUse64BitLabels_68();
  }

  private native void Use64BitLabelsOn_69();
  public void Use64BitLabelsOn()
  {
    Use64BitLabelsOn_69();
  }

  private native void Use64BitLabelsOff_70();
  public void Use64BitLabelsOff()
  {
    Use64BitLabelsOff_70();
  }

  private native boolean GetCopyDataToCellZones_71();
  public boolean GetCopyDataToCellZones()
  {
    return GetCopyDataToCellZones_71();
  }

  private native void SetCopyDataToCellZones_72(boolean id0);
  public void SetCopyDataToCellZones(boolean id0)
  {
    SetCopyDataToCellZones_72(id0);
  }

  private native void CopyDataToCellZonesOn_73();
  public void CopyDataToCellZonesOn()
  {
    CopyDataToCellZonesOn_73();
  }

  private native void CopyDataToCellZonesOff_74();
  public void CopyDataToCellZonesOff()
  {
    CopyDataToCellZonesOff_74();
  }

  private native void SetUse64BitFloats_75(boolean id0);
  public void SetUse64BitFloats(boolean id0)
  {
    SetUse64BitFloats_75(id0);
  }

  private native boolean GetUse64BitFloats_76();
  public boolean GetUse64BitFloats()
  {
    return GetUse64BitFloats_76();
  }

  private native void Use64BitFloatsOn_77();
  public void Use64BitFloatsOn()
  {
    Use64BitFloatsOn_77();
  }

  private native void Use64BitFloatsOff_78();
  public void Use64BitFloatsOff()
  {
    Use64BitFloatsOff_78();
  }

  private native void SetRefresh_79();
  public void SetRefresh()
  {
    SetRefresh_79();
  }

  private native void SetParent_80(vtkOpenFOAMReader id0);
  public void SetParent(vtkOpenFOAMReader id0)
  {
    SetParent_80(id0);
  }

  private native int MakeInformationVector_81(vtkInformationVector id0,byte[] id1, int len1,vtkStringArray id2,vtkDoubleArray id3);
  public int MakeInformationVector(vtkInformationVector id0,String id1,vtkStringArray id2,vtkDoubleArray id3)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return MakeInformationVector_81(id0,bytes1, bytes1.length,id2,id3);
  }

  private native double GetTimeValue_82();
  public double GetTimeValue()
  {
    return GetTimeValue_82();
  }

  private native boolean SetTimeValue_83(double id0);
  public boolean SetTimeValue(double id0)
  {
    return SetTimeValue_83(id0);
  }

  private native long GetTimeNames_84();
  public vtkStringArray GetTimeNames()
  {
    long temp = GetTimeNames_84();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTimeValues_85();
  public vtkDoubleArray GetTimeValues()
  {
    long temp = GetTimeValues_85();

    if (temp == 0) return null;
    return (vtkDoubleArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int MakeMetaDataAtTimeStep_86(boolean id0);
  public int MakeMetaDataAtTimeStep(boolean id0)
  {
    return MakeMetaDataAtTimeStep_86(id0);
  }

  public vtkOpenFOAMReader() { super(); }

  public vtkOpenFOAMReader(long id) { super(id); }
  public native long   VTKInit();

}
