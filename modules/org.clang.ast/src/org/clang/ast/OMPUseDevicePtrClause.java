/**
 * This file was converted to Java from the original LLVM source file. The original
 * source file follows the LLVM Release License, outlined below.
 * 
 * ==============================================================================
 * LLVM Release License
 * ==============================================================================
 * University of Illinois/NCSA
 * Open Source License
 * 
 * Copyright (c) 2003-2017 University of Illinois at Urbana-Champaign.
 * All rights reserved.
 * 
 * Developed by:
 * 
 *     LLVM Team
 * 
 *     University of Illinois at Urbana-Champaign
 * 
 *     http://llvm.org
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal with
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 * 
 *     * Redistributions of source code must retain the above copyright notice,
 *       this list of conditions and the following disclaimers.
 * 
 *     * Redistributions in binary form must reproduce the above copyright notice
 *       this list of conditions and the following disclaimers in the
 *       documentation and/or other materials provided with the distribution.
 * 
 *     * Neither the names of the LLVM Team, University of Illinois at
 *       Urbana-Champaign, nor the names of its contributors may be used to
 *       endorse or promote products derived from this Software without specific
 *       prior written permission.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  IN NO EVENT SHALL THE
 * CONTRIBUTORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS WITH THE
 * SOFTWARE.
 * 
 * ==============================================================================
 * Copyrights and Licenses for Third Party Software Distributed with LLVM:
 * ==============================================================================
 * The LLVM software contains code written by third parties.  Such software will
 * have its own individual LICENSE.TXT file in the directory in which it appears.
 * This file will describe the copyrights, license, and restrictions which apply
 * to that code.
 * 
 * The disclaimer of warranty in the University of Illinois Open Source License
 * applies to all code in the LLVM Distribution, and nothing in any of the
 * other licenses gives permission to use the names of the LLVM Team or the
 * University of Illinois to endorse or promote products derived from this
 * Software.
 * 
 * The following pieces of software have additional or alternate copyrights,
 * licenses, and/or restrictions:
 * 
 * Program             Directory
 * -------             ---------
 * Autoconf            llvm/autoconf
 *                     llvm/projects/ModuleMaker/autoconf
 * Google Test         llvm/utils/unittest/googletest
 * OpenBSD regex       llvm/lib/Support/{reg*, COPYRIGHT.regex}
 * pyyaml tests        llvm/test/YAMLParser/{*.data, LICENSE.TXT}
 * ARM contributions   llvm/lib/Target/ARM/LICENSE.TXT
 * md5 contributions   llvm/lib/Support/MD5.cpp llvm/include/llvm/Support/MD5.h
 */

package org.clang.ast;

import org.clank.support.*;
import org.clank.support.aliases.*;
import static org.clank.support.Casts.*;
import org.llvm.support.*;
import org.llvm.adt.*;
import org.llvm.adt.aliases.*;
import org.clang.basic.*;


/// This represents clause 'use_device_ptr' in the '#pragma omp ...'
/// directives.
///
/// \code
/// #pragma omp target data use_device_ptr(a,b)
/// \endcode
/// In this example directive '#pragma omp target data' has clause
/// 'use_device_ptr' with the variables 'a' and 'b'.
///
//<editor-fold defaultstate="collapsed" desc="clang::OMPUseDevicePtrClause">
@Converted(kind = Converted.Kind.AUTO,
 source = "${LLVM_SRC}/llvm/tools/clang/include/clang/AST/OpenMPClause.h", line = 4230,
 FQN="clang::OMPUseDevicePtrClause", NM="_ZN5clang21OMPUseDevicePtrClauseE",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.ast/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/AST/OpenMPClause.cpp -nm=_ZN5clang21OMPUseDevicePtrClauseE")
//</editor-fold>
public final class OMPUseDevicePtrClause extends /*public*/ OMPVarListClause<OMPUseDevicePtrClause> implements /*private*/ TrailingObjects<OMPUseDevicePtrClause, Expr /*P*/ > {
  /*friend  TrailingObjects<OMPUseDevicePtrClause, Expr *>*/
  /*friend  OMPVarListClause<OMPUseDevicePtrClause>*/
  /*friend  class OMPClauseReader*/
  /// Build clause with number of variables \a N.
  ///
  /// \param StartLoc Starting location of the clause.
  /// \param LParenLoc Location of '('.
  /// \param EndLoc Ending location of the clause.
  /// \param N Number of the variables in the clause.
  ///
  //<editor-fold defaultstate="collapsed" desc="clang::OMPUseDevicePtrClause::OMPUseDevicePtrClause">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/include/clang/AST/OpenMPClause.h", line = 4243,
   FQN="clang::OMPUseDevicePtrClause::OMPUseDevicePtrClause", NM="_ZN5clang21OMPUseDevicePtrClauseC1ENS_14SourceLocationES1_S1_j",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.ast/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/AST/OpenMPClause.cpp -nm=_ZN5clang21OMPUseDevicePtrClauseC1ENS_14SourceLocationES1_S1_j")
  //</editor-fold>
  private OMPUseDevicePtrClause(SourceLocation StartLoc, SourceLocation LParenLoc, 
      SourceLocation EndLoc, /*uint*/int N) {
    // : OMPVarListClause<OMPUseDevicePtrClause>(OMPC_use_device_ptr, StartLoc, LParenLoc, EndLoc, N), TrailingObjects<OMPUseDevicePtrClause, Expr * >() 
    //START JInit
    super(OpenMPClauseKind.OMPC_use_device_ptr, new SourceLocation(StartLoc), 
        new SourceLocation(LParenLoc), new SourceLocation(EndLoc), N);
    $TrailingObjects();
    //END JInit
  }

  
  /// \brief Build an empty clause.
  ///
  /// \param N Number of variables.
  ///
  //<editor-fold defaultstate="collapsed" desc="clang::OMPUseDevicePtrClause::OMPUseDevicePtrClause">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/include/clang/AST/OpenMPClause.h", line = 4252,
   FQN="clang::OMPUseDevicePtrClause::OMPUseDevicePtrClause", NM="_ZN5clang21OMPUseDevicePtrClauseC1Ej",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.ast/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/AST/OpenMPClause.cpp -nm=_ZN5clang21OMPUseDevicePtrClauseC1Ej")
  //</editor-fold>
  private /*explicit*/ OMPUseDevicePtrClause(/*uint*/int N) {
    // : OMPVarListClause<OMPUseDevicePtrClause>(OMPC_use_device_ptr, SourceLocation(), SourceLocation(), SourceLocation(), N), TrailingObjects<OMPUseDevicePtrClause, Expr * >() 
    //START JInit
    super(OpenMPClauseKind.OMPC_use_device_ptr, new SourceLocation(), new SourceLocation(), 
        new SourceLocation(), N);
    $TrailingObjects();
    //END JInit
  }

/*public:*/
  /// Creates clause with a list of variables \a VL.
  ///
  /// \param C AST context.
  /// \param StartLoc Starting location of the clause.
  /// \param LParenLoc Location of '('.
  /// \param EndLoc Ending location of the clause.
  /// \param VL List of references to the variables.
  ///
  //<editor-fold defaultstate="collapsed" desc="clang::OMPUseDevicePtrClause::Create">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/lib/AST/OpenMPClause.cpp", line = 735,
   FQN="clang::OMPUseDevicePtrClause::Create", NM="_ZN5clang21OMPUseDevicePtrClause6CreateERKNS_10ASTContextENS_14SourceLocationES4_S4_N4llvm8ArrayRefIPNS_4ExprEEE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.ast/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/AST/OpenMPClause.cpp -nm=_ZN5clang21OMPUseDevicePtrClause6CreateERKNS_10ASTContextENS_14SourceLocationES4_S4_N4llvm8ArrayRefIPNS_4ExprEEE")
  //</editor-fold>
  public static OMPUseDevicePtrClause /*P*/ Create(final /*const*/ ASTContext /*&*/ C, 
        SourceLocation StartLoc, 
        SourceLocation LParenLoc, 
        SourceLocation EndLoc, 
        ArrayRef<Expr /*P*/ > VL) {
    Object/*void P*/ Mem = C.Allocate(TrailingObjects.totalSizeToAlloc$Same(Expr.class, VL.size()));
    OMPUseDevicePtrClause /*P*/ Clause = /*NEW_EXPR [System]*//*new (Mem)*/ $new_uint_voidPtr(Mem, (type$ptr<?> New$Mem)->{
        return new OMPUseDevicePtrClause(new SourceLocation(StartLoc), new SourceLocation(LParenLoc), new SourceLocation(EndLoc), VL.size());
     });
    Clause.setVarRefs(new ArrayRef<Expr /*P*/ >(VL));
    return Clause;
  }

  /// Creates an empty clause with the place for \a N variables.
  ///
  /// \param C AST context.
  /// \param N The number of variables.
  ///
  //<editor-fold defaultstate="collapsed" desc="clang::OMPUseDevicePtrClause::CreateEmpty">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/lib/AST/OpenMPClause.cpp", line = 747,
   FQN="clang::OMPUseDevicePtrClause::CreateEmpty", NM="_ZN5clang21OMPUseDevicePtrClause11CreateEmptyERKNS_10ASTContextEj",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.ast/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/AST/OpenMPClause.cpp -nm=_ZN5clang21OMPUseDevicePtrClause11CreateEmptyERKNS_10ASTContextEj")
  //</editor-fold>
  public static OMPUseDevicePtrClause /*P*/ CreateEmpty(final /*const*/ ASTContext /*&*/ C, 
             /*uint*/int N) {
    Object/*void P*/ Mem = C.Allocate(TrailingObjects.totalSizeToAlloc$Same(Expr.class, N));
    return /*NEW_EXPR [System]*//*new (Mem)*/ $new_uint_voidPtr(Mem, (type$ptr<?> New$Mem)->{
        return new OMPUseDevicePtrClause(N);
     });
  }

  
  //<editor-fold defaultstate="collapsed" desc="clang::OMPUseDevicePtrClause::children">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/include/clang/AST/OpenMPClause.h", line = 4276,
   FQN="clang::OMPUseDevicePtrClause::children", NM="_ZN5clang21OMPUseDevicePtrClause8childrenEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.ast/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/AST/OpenMPClause.cpp -nm=_ZN5clang21OMPUseDevicePtrClause8childrenEv")
  //</editor-fold>
  public iterator_range<Stmt/*P*/> children() {
    return new iterator_range<Stmt/*P*/>(new StmtIterator(((type$ptr<Stmt /*P*/ /*P*/>)reinterpret_cast(type$ptr.class, varlist_begin()))), 
        new StmtIterator(((type$ptr<Stmt /*P*/ /*P*/>)reinterpret_cast(type$ptr.class, varlist_end()))));
  }

  
  //<editor-fold defaultstate="collapsed" desc="clang::OMPUseDevicePtrClause::classof">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/include/clang/AST/OpenMPClause.h", line = 4281,
   FQN="clang::OMPUseDevicePtrClause::classof", NM="_ZN5clang21OMPUseDevicePtrClause7classofEPKNS_9OMPClauseE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.ast/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/AST/OpenMPClause.cpp -nm=_ZN5clang21OMPUseDevicePtrClause7classofEPKNS_9OMPClauseE")
  //</editor-fold>
  public static boolean classof(/*const*/ OMPClause /*P*/ T) {
    return T.getClauseKind() == OpenMPClauseKind.OMPC_use_device_ptr;
  }

  
  @Override public String toString() {
    return "" + super.toString(); // NOI18N
  }
}
