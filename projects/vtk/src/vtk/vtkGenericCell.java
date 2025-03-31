// java wrapper for vtkGenericCell object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkGenericCell extends vtkCell
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

  private native void SetPoints_4(vtkPoints id0);
  public void SetPoints(vtkPoints id0)
  {
    SetPoints_4(id0);
  }

  private native void SetPointIds_5(vtkIdList id0);
  public void SetPointIds(vtkIdList id0)
  {
    SetPointIds_5(id0);
  }

  private native void ShallowCopy_6(vtkCell id0);
  public void ShallowCopy(vtkCell id0)
  {
    ShallowCopy_6(id0);
  }

  private native void DeepCopy_7(vtkCell id0);
  public void DeepCopy(vtkCell id0)
  {
    DeepCopy_7(id0);
  }

  private native int GetCellType_8();
  public int GetCellType()
  {
    return GetCellType_8();
  }

  private native int GetCellDimension_9();
  public int GetCellDimension()
  {
    return GetCellDimension_9();
  }

  private native int IsLinear_10();
  public int IsLinear()
  {
    return IsLinear_10();
  }

  private native int RequiresInitialization_11();
  public int RequiresInitialization()
  {
    return RequiresInitialization_11();
  }

  private native void Initialize_12();
  public void Initialize()
  {
    Initialize_12();
  }

  private native int RequiresExplicitFaceRepresentation_13();
  public int RequiresExplicitFaceRepresentation()
  {
    return RequiresExplicitFaceRepresentation_13();
  }

  private native int GetNumberOfEdges_14();
  public int GetNumberOfEdges()
  {
    return GetNumberOfEdges_14();
  }

  private native int GetNumberOfFaces_15();
  public int GetNumberOfFaces()
  {
    return GetNumberOfFaces_15();
  }

  private native long GetEdge_16(int id0);
  public vtkCell GetEdge(int id0)
  {
    long temp = GetEdge_16(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFace_17(int id0);
  public vtkCell GetFace(int id0)
  {
    long temp = GetFace_17(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int CellBoundary_18(int id0,double id1[],vtkIdList id2);
  public int CellBoundary(int id0,double id1[],vtkIdList id2)
  {
    return CellBoundary_18(id0,id1,id2);
  }

  private native void Contour_19(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkCellArray id4,vtkCellArray id5,vtkPointData id6,vtkPointData id7,vtkCellData id8,long id9,vtkCellData id10);
  public void Contour(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkCellArray id4,vtkCellArray id5,vtkPointData id6,vtkPointData id7,vtkCellData id8,long id9,vtkCellData id10)
  {
    Contour_19(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10);
  }

  private native void Clip_20(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8,int id9);
  public void Clip(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8,int id9)
  {
    Clip_20(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9);
  }

  private native int Triangulate_21(int id0,vtkIdList id1,vtkPoints id2);
  public int Triangulate(int id0,vtkIdList id1,vtkPoints id2)
  {
    return Triangulate_21(id0,id1,id2);
  }

  private native int TriangulateLocalIds_22(int id0,vtkIdList id1);
  public int TriangulateLocalIds(int id0,vtkIdList id1)
  {
    return TriangulateLocalIds_22(id0,id1);
  }

  private native int TriangulateIds_23(int id0,vtkIdList id1);
  public int TriangulateIds(int id0,vtkIdList id1)
  {
    return TriangulateIds_23(id0,id1);
  }

  private native int GetParametricCenter_24(double id0[]);
  public int GetParametricCenter(double id0[])
  {
    return GetParametricCenter_24(id0);
  }

  private native int IsPrimaryCell_25();
  public int IsPrimaryCell()
  {
    return IsPrimaryCell_25();
  }

  private native void SetCellType_26(int id0);
  public void SetCellType(int id0)
  {
    SetCellType_26(id0);
  }

  private native void SetCellTypeToEmptyCell_27();
  public void SetCellTypeToEmptyCell()
  {
    SetCellTypeToEmptyCell_27();
  }

  private native void SetCellTypeToVertex_28();
  public void SetCellTypeToVertex()
  {
    SetCellTypeToVertex_28();
  }

  private native void SetCellTypeToPolyVertex_29();
  public void SetCellTypeToPolyVertex()
  {
    SetCellTypeToPolyVertex_29();
  }

  private native void SetCellTypeToLine_30();
  public void SetCellTypeToLine()
  {
    SetCellTypeToLine_30();
  }

  private native void SetCellTypeToPolyLine_31();
  public void SetCellTypeToPolyLine()
  {
    SetCellTypeToPolyLine_31();
  }

  private native void SetCellTypeToTriangle_32();
  public void SetCellTypeToTriangle()
  {
    SetCellTypeToTriangle_32();
  }

  private native void SetCellTypeToTriangleStrip_33();
  public void SetCellTypeToTriangleStrip()
  {
    SetCellTypeToTriangleStrip_33();
  }

  private native void SetCellTypeToPolygon_34();
  public void SetCellTypeToPolygon()
  {
    SetCellTypeToPolygon_34();
  }

  private native void SetCellTypeToPixel_35();
  public void SetCellTypeToPixel()
  {
    SetCellTypeToPixel_35();
  }

  private native void SetCellTypeToQuad_36();
  public void SetCellTypeToQuad()
  {
    SetCellTypeToQuad_36();
  }

  private native void SetCellTypeToTetra_37();
  public void SetCellTypeToTetra()
  {
    SetCellTypeToTetra_37();
  }

  private native void SetCellTypeToVoxel_38();
  public void SetCellTypeToVoxel()
  {
    SetCellTypeToVoxel_38();
  }

  private native void SetCellTypeToHexahedron_39();
  public void SetCellTypeToHexahedron()
  {
    SetCellTypeToHexahedron_39();
  }

  private native void SetCellTypeToWedge_40();
  public void SetCellTypeToWedge()
  {
    SetCellTypeToWedge_40();
  }

  private native void SetCellTypeToPyramid_41();
  public void SetCellTypeToPyramid()
  {
    SetCellTypeToPyramid_41();
  }

  private native void SetCellTypeToPentagonalPrism_42();
  public void SetCellTypeToPentagonalPrism()
  {
    SetCellTypeToPentagonalPrism_42();
  }

  private native void SetCellTypeToHexagonalPrism_43();
  public void SetCellTypeToHexagonalPrism()
  {
    SetCellTypeToHexagonalPrism_43();
  }

  private native void SetCellTypeToPolyhedron_44();
  public void SetCellTypeToPolyhedron()
  {
    SetCellTypeToPolyhedron_44();
  }

  private native void SetCellTypeToConvexPointSet_45();
  public void SetCellTypeToConvexPointSet()
  {
    SetCellTypeToConvexPointSet_45();
  }

  private native void SetCellTypeToQuadraticEdge_46();
  public void SetCellTypeToQuadraticEdge()
  {
    SetCellTypeToQuadraticEdge_46();
  }

  private native void SetCellTypeToCubicLine_47();
  public void SetCellTypeToCubicLine()
  {
    SetCellTypeToCubicLine_47();
  }

  private native void SetCellTypeToQuadraticTriangle_48();
  public void SetCellTypeToQuadraticTriangle()
  {
    SetCellTypeToQuadraticTriangle_48();
  }

  private native void SetCellTypeToBiQuadraticTriangle_49();
  public void SetCellTypeToBiQuadraticTriangle()
  {
    SetCellTypeToBiQuadraticTriangle_49();
  }

  private native void SetCellTypeToQuadraticQuad_50();
  public void SetCellTypeToQuadraticQuad()
  {
    SetCellTypeToQuadraticQuad_50();
  }

  private native void SetCellTypeToQuadraticPolygon_51();
  public void SetCellTypeToQuadraticPolygon()
  {
    SetCellTypeToQuadraticPolygon_51();
  }

  private native void SetCellTypeToQuadraticTetra_52();
  public void SetCellTypeToQuadraticTetra()
  {
    SetCellTypeToQuadraticTetra_52();
  }

  private native void SetCellTypeToQuadraticHexahedron_53();
  public void SetCellTypeToQuadraticHexahedron()
  {
    SetCellTypeToQuadraticHexahedron_53();
  }

  private native void SetCellTypeToQuadraticWedge_54();
  public void SetCellTypeToQuadraticWedge()
  {
    SetCellTypeToQuadraticWedge_54();
  }

  private native void SetCellTypeToQuadraticPyramid_55();
  public void SetCellTypeToQuadraticPyramid()
  {
    SetCellTypeToQuadraticPyramid_55();
  }

  private native void SetCellTypeToQuadraticLinearQuad_56();
  public void SetCellTypeToQuadraticLinearQuad()
  {
    SetCellTypeToQuadraticLinearQuad_56();
  }

  private native void SetCellTypeToBiQuadraticQuad_57();
  public void SetCellTypeToBiQuadraticQuad()
  {
    SetCellTypeToBiQuadraticQuad_57();
  }

  private native void SetCellTypeToQuadraticLinearWedge_58();
  public void SetCellTypeToQuadraticLinearWedge()
  {
    SetCellTypeToQuadraticLinearWedge_58();
  }

  private native void SetCellTypeToBiQuadraticQuadraticWedge_59();
  public void SetCellTypeToBiQuadraticQuadraticWedge()
  {
    SetCellTypeToBiQuadraticQuadraticWedge_59();
  }

  private native void SetCellTypeToTriQuadraticHexahedron_60();
  public void SetCellTypeToTriQuadraticHexahedron()
  {
    SetCellTypeToTriQuadraticHexahedron_60();
  }

  private native void SetCellTypeToTriQuadraticPyramid_61();
  public void SetCellTypeToTriQuadraticPyramid()
  {
    SetCellTypeToTriQuadraticPyramid_61();
  }

  private native void SetCellTypeToBiQuadraticQuadraticHexahedron_62();
  public void SetCellTypeToBiQuadraticQuadraticHexahedron()
  {
    SetCellTypeToBiQuadraticQuadraticHexahedron_62();
  }

  private native void SetCellTypeToLagrangeTriangle_63();
  public void SetCellTypeToLagrangeTriangle()
  {
    SetCellTypeToLagrangeTriangle_63();
  }

  private native void SetCellTypeToLagrangeTetra_64();
  public void SetCellTypeToLagrangeTetra()
  {
    SetCellTypeToLagrangeTetra_64();
  }

  private native void SetCellTypeToLagrangeCurve_65();
  public void SetCellTypeToLagrangeCurve()
  {
    SetCellTypeToLagrangeCurve_65();
  }

  private native void SetCellTypeToLagrangeQuadrilateral_66();
  public void SetCellTypeToLagrangeQuadrilateral()
  {
    SetCellTypeToLagrangeQuadrilateral_66();
  }

  private native void SetCellTypeToLagrangeHexahedron_67();
  public void SetCellTypeToLagrangeHexahedron()
  {
    SetCellTypeToLagrangeHexahedron_67();
  }

  private native void SetCellTypeToLagrangeWedge_68();
  public void SetCellTypeToLagrangeWedge()
  {
    SetCellTypeToLagrangeWedge_68();
  }

  private native void SetCellTypeToBezierTriangle_69();
  public void SetCellTypeToBezierTriangle()
  {
    SetCellTypeToBezierTriangle_69();
  }

  private native void SetCellTypeToBezierTetra_70();
  public void SetCellTypeToBezierTetra()
  {
    SetCellTypeToBezierTetra_70();
  }

  private native void SetCellTypeToBezierCurve_71();
  public void SetCellTypeToBezierCurve()
  {
    SetCellTypeToBezierCurve_71();
  }

  private native void SetCellTypeToBezierQuadrilateral_72();
  public void SetCellTypeToBezierQuadrilateral()
  {
    SetCellTypeToBezierQuadrilateral_72();
  }

  private native void SetCellTypeToBezierHexahedron_73();
  public void SetCellTypeToBezierHexahedron()
  {
    SetCellTypeToBezierHexahedron_73();
  }

  private native void SetCellTypeToBezierWedge_74();
  public void SetCellTypeToBezierWedge()
  {
    SetCellTypeToBezierWedge_74();
  }

  private native long InstantiateCell_75(int id0);
  public vtkCell InstantiateCell(int id0)
  {
    long temp = InstantiateCell_75(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRepresentativeCell_76();
  public vtkCell GetRepresentativeCell()
  {
    long temp = GetRepresentativeCell_76();

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkGenericCell() { super(); }

  public vtkGenericCell(long id) { super(id); }
  public native long   VTKInit();

}
