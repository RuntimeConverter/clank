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

package org.llvm.ir.impl;

import org.clank.support.*;
import org.clank.support.aliases.*;
import static org.clank.support.Native.*;
import static org.clank.support.Unsigned.*;
import org.clank.support.NativeCallback.*;
import org.llvm.ir.*;
import org.llvm.ir.impl.*;
import static org.llvm.ir.java.IrRTTI.*;


/// BinaryConstantExpr - This class is private to Constants.cpp, and is used
/// behind the scenes to implement binary constant exprs.
//<editor-fold defaultstate="collapsed" desc="llvm::BinaryConstantExpr">
@Converted(kind = Converted.Kind.AUTO,
 source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 50,
 FQN="llvm::BinaryConstantExpr", NM="_ZN4llvm18BinaryConstantExprE",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/LLVMContextImpl.cpp -nm=_ZN4llvm18BinaryConstantExprE")
//</editor-fold>
public class BinaryConstantExpr extends /*public*/ ConstantExpr implements Destructors.ClassWithDestructor {
  //<editor-fold defaultstate="collapsed" desc="llvm::BinaryConstantExpr::anchor">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/lib/IR/LLVMContextImpl.cpp", line = 219,
   FQN="llvm::BinaryConstantExpr::anchor", NM="_ZN4llvm18BinaryConstantExpr6anchorEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/LLVMContextImpl.cpp -nm=_ZN4llvm18BinaryConstantExpr6anchorEv")
  //</editor-fold>
  @Override protected/*private*/ void anchor()/* override*/ {
  }

  //<editor-fold defaultstate="collapsed" desc="llvm::BinaryConstantExpr::operator new">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 52,
   FQN="llvm::BinaryConstantExpr::operator new", NM="_ZN4llvm18BinaryConstantExprnwEjj",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/LLVMContextImpl.cpp -nm=_ZN4llvm18BinaryConstantExprnwEjj")
  //</editor-fold>
  protected/*private*/ static Object/*void P*/ $new(/*size_t*/int $Prm0, /*uint*/int $Prm1) { throw new UnsupportedOperationException("Deleted");}

/*public:*/
  // allocate space for exactly two operands
  //<editor-fold defaultstate="collapsed" desc="llvm::BinaryConstantExpr::operator new">
  @Converted(kind = Converted.Kind.MANUAL_COMPILATION,
   source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 55,
   FQN="llvm::BinaryConstantExpr::operator new", NM="_ZN4llvm18BinaryConstantExprnwEj",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/LLVMContextImpl.cpp -nm=_ZN4llvm18BinaryConstantExprnwEj")
  //</editor-fold>
  public static <T extends BinaryConstantExpr>/*void P*/ T $new_BinaryConstantExpr(New$ConstructorCallback<T> $Ctor) {
    return User.$new_FixedUses(/*s, */2, $Ctor);
  }

  //<editor-fold defaultstate="collapsed" desc="llvm::BinaryConstantExpr::BinaryConstantExpr">
  @Converted(kind = Converted.Kind.MANUAL_COMPILATION,
   source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 58,
   FQN="llvm::BinaryConstantExpr::BinaryConstantExpr", NM="_ZN4llvm18BinaryConstantExprC1EjPNS_8ConstantES2_j",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/LLVMContextImpl.cpp -nm=_ZN4llvm18BinaryConstantExprC1EjPNS_8ConstantES2_j")
  //</editor-fold>
  public BinaryConstantExpr(/*uint*/int Opcode, Constant /*P*/ C1, Constant /*P*/ C2,
      /*uint*/int Flags) {
    // : ConstantExpr(C1->getType(), Opcode, &Op<0>(), 2)
    //START JInit
    super(C1.getType(), Opcode, $AddrOf(OpFrom$Addr(0, User.$BEING_CREATED(), BinaryConstantExpr.class)), 2);
    //END JInit
    this./*<0>*/Op(0).$assign(C1);
    this./*<1>*/Op(1).$assign(C2);
    SubclassOptionalData = $uchar2uchar_7bits($uint2uchar(Flags));
  }

/// Transparently provide more efficient getOperand methods.
  /*public:*/
  //<editor-fold defaultstate="collapsed" desc="llvm::BinaryConstantExpr::getOperand">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 291,
   FQN="llvm::BinaryConstantExpr::getOperand", NM="_ZNK4llvm18BinaryConstantExpr10getOperandEj",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/LLVMContextImpl.cpp -nm=_ZNK4llvm18BinaryConstantExpr10getOperandEj")
  //</editor-fold>
  public Value /*P*/ getOperand(/*uint*/int i_nocapture) /*const*/ {
    assert ($less_uint(i_nocapture, OperandTraitsBinaryConstantExpr.<BinaryConstantExpr>operands$FixedNumOperandTraits(this))) : "getOperand() out of range!";
    return cast_or_null_Value(OperandTraitsBinaryConstantExpr.<BinaryConstantExpr>op_begin(((/*const_cast*/BinaryConstantExpr /*P*/ )(this))).$at(i_nocapture).get());
  }

  //<editor-fold defaultstate="collapsed" desc="llvm::BinaryConstantExpr::setOperand">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 291,
   FQN="llvm::BinaryConstantExpr::setOperand", NM="_ZN4llvm18BinaryConstantExpr10setOperandEjPNS_5ValueE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/LLVMContextImpl.cpp -nm=_ZN4llvm18BinaryConstantExpr10setOperandEjPNS_5ValueE")
  //</editor-fold>
  public void setOperand(/*uint*/int i_nocapture, Value /*P*/ Val_nocapture) {
    assert ($less_uint(i_nocapture, OperandTraitsBinaryConstantExpr.<BinaryConstantExpr>operands$FixedNumOperandTraits(this))) : "setOperand() out of range!";
    OperandTraitsBinaryConstantExpr.<BinaryConstantExpr>op_begin(this).$at(i_nocapture).$assign(Val_nocapture);
  }

  //<editor-fold defaultstate="collapsed" desc="llvm::BinaryConstantExpr::op_begin">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 291,
   FQN="llvm::BinaryConstantExpr::op_begin", NM="_ZN4llvm18BinaryConstantExpr8op_beginEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/LLVMContextImpl.cpp -nm=_ZN4llvm18BinaryConstantExpr8op_beginEv")
  //</editor-fold>
  public type$ptr<Use /*P*/> op_begin() {
    return OperandTraitsBinaryConstantExpr.<BinaryConstantExpr>op_begin(this);
  }

  //<editor-fold defaultstate="collapsed" desc="llvm::BinaryConstantExpr::op_begin">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 291,
   FQN="llvm::BinaryConstantExpr::op_begin", NM="_ZNK4llvm18BinaryConstantExpr8op_beginEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/LLVMContextImpl.cpp -nm=_ZNK4llvm18BinaryConstantExpr8op_beginEv")
  //</editor-fold>
  public /*const*/type$ptr<Use /*P*/> op_begin$Const() /*const*/ {
    return OperandTraitsBinaryConstantExpr.<BinaryConstantExpr>op_begin(((/*const_cast*/BinaryConstantExpr /*P*/ )(this)));
  }

  //<editor-fold defaultstate="collapsed" desc="llvm::BinaryConstantExpr::op_end">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 291,
   FQN="llvm::BinaryConstantExpr::op_end", NM="_ZN4llvm18BinaryConstantExpr6op_endEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/LLVMContextImpl.cpp -nm=_ZN4llvm18BinaryConstantExpr6op_endEv")
  //</editor-fold>
  public type$ptr<Use /*P*/> op_end() {
    return OperandTraitsBinaryConstantExpr.<BinaryConstantExpr>op_end(this);
  }

  //<editor-fold defaultstate="collapsed" desc="llvm::BinaryConstantExpr::op_end">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 291,
   FQN="llvm::BinaryConstantExpr::op_end", NM="_ZNK4llvm18BinaryConstantExpr6op_endEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/LLVMContextImpl.cpp -nm=_ZNK4llvm18BinaryConstantExpr6op_endEv")
  //</editor-fold>
  public /*const*/type$ptr<Use /*P*/> op_end$Const() /*const*/ {
    return OperandTraitsBinaryConstantExpr.<BinaryConstantExpr>op_end(((/*const_cast*/BinaryConstantExpr /*P*/ )(this)));
  }

/*protected:*/
  /*template <int> TEMPLATE*/
  //<editor-fold defaultstate="collapsed" desc="llvm::BinaryConstantExpr::Op">
  @Converted(kind = Converted.Kind.MANUAL_COMPILATION,
   source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 291,
   FQN="llvm::BinaryConstantExpr::Op", NM="Tpl__ZN4llvm18BinaryConstantExpr2OpEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/LLVMContextImpl.cpp -nm=Tpl__ZN4llvm18BinaryConstantExpr2OpEv")
  //</editor-fold>
  protected Use /*&*/ Op(int Idx_nocapture) {
    return this.OpFrom(Idx_nocapture, this);
  }

  /*template <int> TEMPLATE*/
  //<editor-fold defaultstate="collapsed" desc="llvm::BinaryConstantExpr::Op">
  @Converted(kind = Converted.Kind.MANUAL_COMPILATION,
   source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 291,
   FQN="llvm::BinaryConstantExpr::Op", NM="Tpl__ZNK4llvm18BinaryConstantExpr2OpEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/LLVMContextImpl.cpp -nm=Tpl__ZNK4llvm18BinaryConstantExpr2OpEv")
  //</editor-fold>
  protected /*const*/ Use /*&*/ Op$Const(int Idx_nocapture) /*const*/ {
    return this.OpFrom(Idx_nocapture, this);
  }

/*public:*/
  //<editor-fold defaultstate="collapsed" desc="llvm::BinaryConstantExpr::getNumOperands">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 291,
   FQN="llvm::BinaryConstantExpr::getNumOperands", NM="_ZNK4llvm18BinaryConstantExpr14getNumOperandsEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/LLVMContextImpl.cpp -nm=_ZNK4llvm18BinaryConstantExpr14getNumOperandsEv")
  //</editor-fold>
  public /*uint*/int getNumOperands() /*const*/ {
    return OperandTraitsBinaryConstantExpr.<BinaryConstantExpr>operands$FixedNumOperandTraits(this);
  }

  //<editor-fold defaultstate="collapsed" desc="llvm::BinaryConstantExpr::~BinaryConstantExpr">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/lib/IR/ConstantsContext.h", line = 50,
   FQN="llvm::BinaryConstantExpr::~BinaryConstantExpr", NM="_ZN4llvm18BinaryConstantExprD0Ev",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/IR/LLVMContextImpl.cpp -nm=_ZN4llvm18BinaryConstantExprD0Ev")
  //</editor-fold>
  @Override public /*inline*/ void $destroy() {
    super.$destroy();
  }


  @Override public String toString() {
    return "" + super.toString(); // NOI18N
  }
}
