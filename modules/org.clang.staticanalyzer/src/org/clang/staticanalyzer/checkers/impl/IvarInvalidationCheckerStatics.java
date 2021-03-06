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
package org.clang.staticanalyzer.checkers.impl;

import org.clank.support.*;
import static org.llvm.support.llvm.*;
import org.clang.ast.*;
import org.clang.staticanalyzer.core.ento.*;


//<editor-fold defaultstate="collapsed" desc="static type IvarInvalidationCheckerStatics">
@Converted(kind = Converted.Kind.AUTO,
 cmd="jclank.sh -java-options=${SPUTNIK}/contrib/JConvert/llvmToClankType -print -java-options=${SPUTNIK}/modules/org.clang.staticanalyzer/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Checkers/IvarInvalidationChecker.cpp -nm=_ZN12_GLOBAL__N_112ChecksFilterE;_ZN12_GLOBAL__N_1L20isInvalidationMethodEPKN5clang14ObjCMethodDeclEb; -static-type=IvarInvalidationCheckerStatics -package=org.clang.staticanalyzer.checkers.impl")
//</editor-fold>
public final class IvarInvalidationCheckerStatics {

//<editor-fold defaultstate="collapsed" desc="(anonymous namespace)::ChecksFilter">
@Converted(kind = Converted.Kind.AUTO,
 source = "${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Checkers/IvarInvalidationChecker.cpp", line = 46,
 FQN="(anonymous namespace)::ChecksFilter", NM="_ZN12_GLOBAL__N_112ChecksFilterE",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.staticanalyzer/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Checkers/IvarInvalidationChecker.cpp -nm=_ZN12_GLOBAL__N_112ChecksFilterE")
//</editor-fold>
public static class/*struct*/ ChecksFilter {
  /// Check for missing invalidation method declarations.
  public DefaultBool check_MissingInvalidationMethod;
  /// Check that all ivars are invalidated.
  public DefaultBool check_InstanceVariableInvalidation;
  
  public CheckName checkName_MissingInvalidationMethod;
  public CheckName checkName_InstanceVariableInvalidation;
  //<editor-fold defaultstate="collapsed" desc="(anonymous namespace)::ChecksFilter::ChecksFilter">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Checkers/IvarInvalidationChecker.cpp", line = 46,
   FQN="(anonymous namespace)::ChecksFilter::ChecksFilter", NM="_ZN12_GLOBAL__N_112ChecksFilterC1Ev",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.staticanalyzer/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Checkers/IvarInvalidationChecker.cpp -nm=_ZN12_GLOBAL__N_112ChecksFilterC1Ev")
  //</editor-fold>
  public /*inline*/ ChecksFilter() {
    // : check_MissingInvalidationMethod(), check_InstanceVariableInvalidation(), checkName_MissingInvalidationMethod(), checkName_InstanceVariableInvalidation() 
    //START JInit
    this.check_MissingInvalidationMethod = new DefaultBool();
    this.check_InstanceVariableInvalidation = new DefaultBool();
    this.checkName_MissingInvalidationMethod = new CheckName();
    this.checkName_InstanceVariableInvalidation = new CheckName();
    //END JInit
  }

  
  @Override public String toString() {
    return "" + "check_MissingInvalidationMethod=" + check_MissingInvalidationMethod // NOI18N
              + ", check_InstanceVariableInvalidation=" + check_InstanceVariableInvalidation // NOI18N
              + ", checkName_MissingInvalidationMethod=" + checkName_MissingInvalidationMethod // NOI18N
              + ", checkName_InstanceVariableInvalidation=" + checkName_InstanceVariableInvalidation; // NOI18N
  }
}
//<editor-fold defaultstate="collapsed" desc="(anonymous namespace)::isInvalidationMethod">
@Converted(kind = Converted.Kind.AUTO,
 source = "${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Checkers/IvarInvalidationChecker.cpp", line = 227,
 FQN="(anonymous namespace)::isInvalidationMethod", NM="_ZN12_GLOBAL__N_1L20isInvalidationMethodEPKN5clang14ObjCMethodDeclEb",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.staticanalyzer/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Checkers/IvarInvalidationChecker.cpp -nm=_ZN12_GLOBAL__N_1L20isInvalidationMethodEPKN5clang14ObjCMethodDeclEb")
//</editor-fold>
public static boolean isInvalidationMethod(/*const*/ ObjCMethodDecl /*P*/ M, boolean LookForPartial) {
  for (/*const*/ AnnotateAttr /*P*/ Ann : M.specific_attrs(AnnotateAttr.class)) {
    if (!LookForPartial
       && $eq_StringRef(Ann.getAnnotation(), /*STRINGREF_STR*/"objc_instance_variable_invalidator")) {
      return true;
    }
    if (LookForPartial
       && $eq_StringRef(Ann.getAnnotation(), /*STRINGREF_STR*/"objc_instance_variable_invalidator_partial")) {
      return true;
    }
  }
  return false;
}

} // END OF class IvarInvalidationCheckerStatics
