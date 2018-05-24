package org.docksidestage.hangar.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.docksidestage.hangar.dbflute.allcommon.*;
import org.docksidestage.hangar.dbflute.cbean.*;
import org.docksidestage.hangar.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of WHITE_COMPOUND_PK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteCompoundPkCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteCompoundPkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "WHITE_COMPOUND_PK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PK_FIRST_ID: {PK, NotNull, DECIMAL(16)}
     * @param pkFirstId The value of pkFirstId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkFirstId_Equal(Long pkFirstId) {
        doSetPkFirstId_Equal(pkFirstId);
    }

    protected void doSetPkFirstId_Equal(Long pkFirstId) {
        regPkFirstId(CK_EQ, pkFirstId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PK_FIRST_ID: {PK, NotNull, DECIMAL(16)}
     * @param pkFirstId The value of pkFirstId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkFirstId_NotEqual(Long pkFirstId) {
        doSetPkFirstId_NotEqual(pkFirstId);
    }

    protected void doSetPkFirstId_NotEqual(Long pkFirstId) {
        regPkFirstId(CK_NES, pkFirstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PK_FIRST_ID: {PK, NotNull, DECIMAL(16)}
     * @param pkFirstId The value of pkFirstId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkFirstId_GreaterThan(Long pkFirstId) {
        regPkFirstId(CK_GT, pkFirstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PK_FIRST_ID: {PK, NotNull, DECIMAL(16)}
     * @param pkFirstId The value of pkFirstId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkFirstId_LessThan(Long pkFirstId) {
        regPkFirstId(CK_LT, pkFirstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PK_FIRST_ID: {PK, NotNull, DECIMAL(16)}
     * @param pkFirstId The value of pkFirstId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkFirstId_GreaterEqual(Long pkFirstId) {
        regPkFirstId(CK_GE, pkFirstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PK_FIRST_ID: {PK, NotNull, DECIMAL(16)}
     * @param pkFirstId The value of pkFirstId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkFirstId_LessEqual(Long pkFirstId) {
        regPkFirstId(CK_LE, pkFirstId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PK_FIRST_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of pkFirstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pkFirstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPkFirstId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPkFirstId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PK_FIRST_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of pkFirstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pkFirstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPkFirstId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePkFirstId(), "PK_FIRST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PK_FIRST_ID: {PK, NotNull, DECIMAL(16)}
     * @param pkFirstIdList The collection of pkFirstId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPkFirstId_InScope(Collection<Long> pkFirstIdList) {
        doSetPkFirstId_InScope(pkFirstIdList);
    }

    protected void doSetPkFirstId_InScope(Collection<Long> pkFirstIdList) {
        regINS(CK_INS, cTL(pkFirstIdList), xgetCValuePkFirstId(), "PK_FIRST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PK_FIRST_ID: {PK, NotNull, DECIMAL(16)}
     * @param pkFirstIdList The collection of pkFirstId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPkFirstId_NotInScope(Collection<Long> pkFirstIdList) {
        doSetPkFirstId_NotInScope(pkFirstIdList);
    }

    protected void doSetPkFirstId_NotInScope(Collection<Long> pkFirstIdList) {
        regINS(CK_NINS, cTL(pkFirstIdList), xgetCValuePkFirstId(), "PK_FIRST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PK_FIRST_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setPkFirstId_IsNull() { regPkFirstId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PK_FIRST_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setPkFirstId_IsNotNull() { regPkFirstId(CK_ISNN, DOBJ); }

    protected void regPkFirstId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePkFirstId(), "PK_FIRST_ID"); }
    protected abstract ConditionValue xgetCValuePkFirstId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PK_SECOND_ID: {PK, NotNull, DECIMAL(16)}
     * @param pkSecondId The value of pkSecondId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkSecondId_Equal(Long pkSecondId) {
        doSetPkSecondId_Equal(pkSecondId);
    }

    protected void doSetPkSecondId_Equal(Long pkSecondId) {
        regPkSecondId(CK_EQ, pkSecondId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PK_SECOND_ID: {PK, NotNull, DECIMAL(16)}
     * @param pkSecondId The value of pkSecondId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkSecondId_NotEqual(Long pkSecondId) {
        doSetPkSecondId_NotEqual(pkSecondId);
    }

    protected void doSetPkSecondId_NotEqual(Long pkSecondId) {
        regPkSecondId(CK_NES, pkSecondId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PK_SECOND_ID: {PK, NotNull, DECIMAL(16)}
     * @param pkSecondId The value of pkSecondId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkSecondId_GreaterThan(Long pkSecondId) {
        regPkSecondId(CK_GT, pkSecondId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PK_SECOND_ID: {PK, NotNull, DECIMAL(16)}
     * @param pkSecondId The value of pkSecondId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkSecondId_LessThan(Long pkSecondId) {
        regPkSecondId(CK_LT, pkSecondId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PK_SECOND_ID: {PK, NotNull, DECIMAL(16)}
     * @param pkSecondId The value of pkSecondId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkSecondId_GreaterEqual(Long pkSecondId) {
        regPkSecondId(CK_GE, pkSecondId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PK_SECOND_ID: {PK, NotNull, DECIMAL(16)}
     * @param pkSecondId The value of pkSecondId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkSecondId_LessEqual(Long pkSecondId) {
        regPkSecondId(CK_LE, pkSecondId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PK_SECOND_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of pkSecondId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pkSecondId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPkSecondId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPkSecondId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PK_SECOND_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of pkSecondId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pkSecondId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPkSecondId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePkSecondId(), "PK_SECOND_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PK_SECOND_ID: {PK, NotNull, DECIMAL(16)}
     * @param pkSecondIdList The collection of pkSecondId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPkSecondId_InScope(Collection<Long> pkSecondIdList) {
        doSetPkSecondId_InScope(pkSecondIdList);
    }

    protected void doSetPkSecondId_InScope(Collection<Long> pkSecondIdList) {
        regINS(CK_INS, cTL(pkSecondIdList), xgetCValuePkSecondId(), "PK_SECOND_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PK_SECOND_ID: {PK, NotNull, DECIMAL(16)}
     * @param pkSecondIdList The collection of pkSecondId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPkSecondId_NotInScope(Collection<Long> pkSecondIdList) {
        doSetPkSecondId_NotInScope(pkSecondIdList);
    }

    protected void doSetPkSecondId_NotInScope(Collection<Long> pkSecondIdList) {
        regINS(CK_NINS, cTL(pkSecondIdList), xgetCValuePkSecondId(), "PK_SECOND_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PK_SECOND_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setPkSecondId_IsNull() { regPkSecondId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PK_SECOND_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setPkSecondId_IsNotNull() { regPkSecondId(CK_ISNN, DOBJ); }

    protected void regPkSecondId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePkSecondId(), "PK_SECOND_ID"); }
    protected abstract ConditionValue xgetCValuePkSecondId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPOUND_PK_NAME: {NotNull, VARCHAR(200)}
     * @param compoundPkName The value of compoundPkName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompoundPkName_Equal(String compoundPkName) {
        doSetCompoundPkName_Equal(fRES(compoundPkName));
    }

    protected void doSetCompoundPkName_Equal(String compoundPkName) {
        regCompoundPkName(CK_EQ, compoundPkName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPOUND_PK_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setCompoundPkName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param compoundPkName The value of compoundPkName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCompoundPkName_LikeSearch(String compoundPkName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCompoundPkName_LikeSearch(compoundPkName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPOUND_PK_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setCompoundPkName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param compoundPkName The value of compoundPkName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCompoundPkName_LikeSearch(String compoundPkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(compoundPkName), xgetCValueCompoundPkName(), "COMPOUND_PK_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPOUND_PK_NAME: {NotNull, VARCHAR(200)}
     * @param compoundPkName The value of compoundPkName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCompoundPkName_NotLikeSearch(String compoundPkName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCompoundPkName_NotLikeSearch(compoundPkName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPOUND_PK_NAME: {NotNull, VARCHAR(200)}
     * @param compoundPkName The value of compoundPkName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCompoundPkName_NotLikeSearch(String compoundPkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(compoundPkName), xgetCValueCompoundPkName(), "COMPOUND_PK_NAME", likeSearchOption);
    }

    protected void regCompoundPkName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompoundPkName(), "COMPOUND_PK_NAME"); }
    protected abstract ConditionValue xgetCValueCompoundPkName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @param referredId The value of referredId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReferredId_Equal(Integer referredId) {
        doSetReferredId_Equal(referredId);
    }

    protected void doSetReferredId_Equal(Integer referredId) {
        regReferredId(CK_EQ, referredId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @param referredId The value of referredId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReferredId_NotEqual(Integer referredId) {
        doSetReferredId_NotEqual(referredId);
    }

    protected void doSetReferredId_NotEqual(Integer referredId) {
        regReferredId(CK_NES, referredId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @param referredId The value of referredId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReferredId_GreaterThan(Integer referredId) {
        regReferredId(CK_GT, referredId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @param referredId The value of referredId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReferredId_LessThan(Integer referredId) {
        regReferredId(CK_LT, referredId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @param referredId The value of referredId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReferredId_GreaterEqual(Integer referredId) {
        regReferredId(CK_GE, referredId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @param referredId The value of referredId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReferredId_LessEqual(Integer referredId) {
        regReferredId(CK_LE, referredId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @param minNumber The min number of referredId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of referredId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setReferredId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setReferredId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @param minNumber The min number of referredId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of referredId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setReferredId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReferredId(), "REFERRED_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @param referredIdList The collection of referredId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferredId_InScope(Collection<Integer> referredIdList) {
        doSetReferredId_InScope(referredIdList);
    }

    protected void doSetReferredId_InScope(Collection<Integer> referredIdList) {
        regINS(CK_INS, cTL(referredIdList), xgetCValueReferredId(), "REFERRED_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @param referredIdList The collection of referredId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferredId_NotInScope(Collection<Integer> referredIdList) {
        doSetReferredId_NotInScope(referredIdList);
    }

    protected void doSetReferredId_NotInScope(Collection<Integer> referredIdList) {
        regINS(CK_NINS, cTL(referredIdList), xgetCValueReferredId(), "REFERRED_ID");
    }

    protected void regReferredId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReferredId(), "REFERRED_ID"); }
    protected abstract ConditionValue xgetCValueReferredId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteCompoundPkCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteCompoundPkCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteCompoundPkCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteCompoundPkCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteCompoundPkCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteCompoundPkCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteCompoundPkCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteCompoundPkCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteCompoundPkCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteCompoundPkCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteCompoundPkCB&gt;() {
     *     public void query(WhiteCompoundPkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteCompoundPkCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteCompoundPkCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteCompoundPkCQ sq);

    protected WhiteCompoundPkCB xcreateScalarConditionCB() {
        WhiteCompoundPkCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteCompoundPkCB xcreateScalarConditionPartitionByCB() {
        WhiteCompoundPkCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected WhiteCompoundPkCB newMyCB() {
        return new WhiteCompoundPkCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteCompoundPkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
