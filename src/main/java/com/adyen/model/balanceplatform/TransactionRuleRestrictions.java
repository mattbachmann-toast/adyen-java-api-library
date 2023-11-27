/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.balanceplatform.ActiveNetworkTokensRestriction;
import com.adyen.model.balanceplatform.BrandVariantsRestriction;
import com.adyen.model.balanceplatform.CounterpartyBankRestriction;
import com.adyen.model.balanceplatform.CountriesRestriction;
import com.adyen.model.balanceplatform.DayOfWeekRestriction;
import com.adyen.model.balanceplatform.DifferentCurrenciesRestriction;
import com.adyen.model.balanceplatform.EntryModesRestriction;
import com.adyen.model.balanceplatform.InternationalTransactionRestriction;
import com.adyen.model.balanceplatform.MatchingTransactionsRestriction;
import com.adyen.model.balanceplatform.MccsRestriction;
import com.adyen.model.balanceplatform.MerchantNamesRestriction;
import com.adyen.model.balanceplatform.MerchantsRestriction;
import com.adyen.model.balanceplatform.ProcessingTypesRestriction;
import com.adyen.model.balanceplatform.SameAmountRestriction;
import com.adyen.model.balanceplatform.SameCounterpartyRestriction;
import com.adyen.model.balanceplatform.TimeOfDayRestriction;
import com.adyen.model.balanceplatform.TotalAmountRestriction;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * TransactionRuleRestrictions
 */
@JsonPropertyOrder({
  TransactionRuleRestrictions.JSON_PROPERTY_ACTIVE_NETWORK_TOKENS,
  TransactionRuleRestrictions.JSON_PROPERTY_BRAND_VARIANTS,
  TransactionRuleRestrictions.JSON_PROPERTY_COUNTERPARTY_BANK,
  TransactionRuleRestrictions.JSON_PROPERTY_COUNTRIES,
  TransactionRuleRestrictions.JSON_PROPERTY_DAY_OF_WEEK,
  TransactionRuleRestrictions.JSON_PROPERTY_DIFFERENT_CURRENCIES,
  TransactionRuleRestrictions.JSON_PROPERTY_ENTRY_MODES,
  TransactionRuleRestrictions.JSON_PROPERTY_INTERNATIONAL_TRANSACTION,
  TransactionRuleRestrictions.JSON_PROPERTY_MATCHING_TRANSACTIONS,
  TransactionRuleRestrictions.JSON_PROPERTY_MCCS,
  TransactionRuleRestrictions.JSON_PROPERTY_MERCHANT_NAMES,
  TransactionRuleRestrictions.JSON_PROPERTY_MERCHANTS,
  TransactionRuleRestrictions.JSON_PROPERTY_PROCESSING_TYPES,
  TransactionRuleRestrictions.JSON_PROPERTY_SAME_AMOUNT_RESTRICTION,
  TransactionRuleRestrictions.JSON_PROPERTY_SAME_COUNTERPARTY_RESTRICTION,
  TransactionRuleRestrictions.JSON_PROPERTY_TIME_OF_DAY,
  TransactionRuleRestrictions.JSON_PROPERTY_TOTAL_AMOUNT
})

public class TransactionRuleRestrictions {
  public static final String JSON_PROPERTY_ACTIVE_NETWORK_TOKENS = "activeNetworkTokens";
  private ActiveNetworkTokensRestriction activeNetworkTokens;

  public static final String JSON_PROPERTY_BRAND_VARIANTS = "brandVariants";
  private BrandVariantsRestriction brandVariants;

  public static final String JSON_PROPERTY_COUNTERPARTY_BANK = "counterpartyBank";
  private CounterpartyBankRestriction counterpartyBank;

  public static final String JSON_PROPERTY_COUNTRIES = "countries";
  private CountriesRestriction countries;

  public static final String JSON_PROPERTY_DAY_OF_WEEK = "dayOfWeek";
  private DayOfWeekRestriction dayOfWeek;

  public static final String JSON_PROPERTY_DIFFERENT_CURRENCIES = "differentCurrencies";
  private DifferentCurrenciesRestriction differentCurrencies;

  public static final String JSON_PROPERTY_ENTRY_MODES = "entryModes";
  private EntryModesRestriction entryModes;

  public static final String JSON_PROPERTY_INTERNATIONAL_TRANSACTION = "internationalTransaction";
  private InternationalTransactionRestriction internationalTransaction;

  public static final String JSON_PROPERTY_MATCHING_TRANSACTIONS = "matchingTransactions";
  private MatchingTransactionsRestriction matchingTransactions;

  public static final String JSON_PROPERTY_MCCS = "mccs";
  private MccsRestriction mccs;

  public static final String JSON_PROPERTY_MERCHANT_NAMES = "merchantNames";
  private MerchantNamesRestriction merchantNames;

  public static final String JSON_PROPERTY_MERCHANTS = "merchants";
  private MerchantsRestriction merchants;

  public static final String JSON_PROPERTY_PROCESSING_TYPES = "processingTypes";
  private ProcessingTypesRestriction processingTypes;

  public static final String JSON_PROPERTY_SAME_AMOUNT_RESTRICTION = "sameAmountRestriction";
  private SameAmountRestriction sameAmountRestriction;

  public static final String JSON_PROPERTY_SAME_COUNTERPARTY_RESTRICTION = "sameCounterpartyRestriction";
  private SameCounterpartyRestriction sameCounterpartyRestriction;

  public static final String JSON_PROPERTY_TIME_OF_DAY = "timeOfDay";
  private TimeOfDayRestriction timeOfDay;

  public static final String JSON_PROPERTY_TOTAL_AMOUNT = "totalAmount";
  private TotalAmountRestriction totalAmount;

  public TransactionRuleRestrictions() { 
  }

  public TransactionRuleRestrictions activeNetworkTokens(ActiveNetworkTokensRestriction activeNetworkTokens) {
    this.activeNetworkTokens = activeNetworkTokens;
    return this;
  }

   /**
   * Get activeNetworkTokens
   * @return activeNetworkTokens
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTIVE_NETWORK_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActiveNetworkTokensRestriction getActiveNetworkTokens() {
    return activeNetworkTokens;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_NETWORK_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveNetworkTokens(ActiveNetworkTokensRestriction activeNetworkTokens) {
    this.activeNetworkTokens = activeNetworkTokens;
  }


  public TransactionRuleRestrictions brandVariants(BrandVariantsRestriction brandVariants) {
    this.brandVariants = brandVariants;
    return this;
  }

   /**
   * Get brandVariants
   * @return brandVariants
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BRAND_VARIANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BrandVariantsRestriction getBrandVariants() {
    return brandVariants;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_VARIANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandVariants(BrandVariantsRestriction brandVariants) {
    this.brandVariants = brandVariants;
  }


  public TransactionRuleRestrictions counterpartyBank(CounterpartyBankRestriction counterpartyBank) {
    this.counterpartyBank = counterpartyBank;
    return this;
  }

   /**
   * Get counterpartyBank
   * @return counterpartyBank
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTERPARTY_BANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CounterpartyBankRestriction getCounterpartyBank() {
    return counterpartyBank;
  }


  @JsonProperty(JSON_PROPERTY_COUNTERPARTY_BANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCounterpartyBank(CounterpartyBankRestriction counterpartyBank) {
    this.counterpartyBank = counterpartyBank;
  }


  public TransactionRuleRestrictions countries(CountriesRestriction countries) {
    this.countries = countries;
    return this;
  }

   /**
   * Get countries
   * @return countries
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CountriesRestriction getCountries() {
    return countries;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountries(CountriesRestriction countries) {
    this.countries = countries;
  }


  public TransactionRuleRestrictions dayOfWeek(DayOfWeekRestriction dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * Get dayOfWeek
   * @return dayOfWeek
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAY_OF_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DayOfWeekRestriction getDayOfWeek() {
    return dayOfWeek;
  }


  @JsonProperty(JSON_PROPERTY_DAY_OF_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDayOfWeek(DayOfWeekRestriction dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }


  public TransactionRuleRestrictions differentCurrencies(DifferentCurrenciesRestriction differentCurrencies) {
    this.differentCurrencies = differentCurrencies;
    return this;
  }

   /**
   * Get differentCurrencies
   * @return differentCurrencies
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DIFFERENT_CURRENCIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DifferentCurrenciesRestriction getDifferentCurrencies() {
    return differentCurrencies;
  }


  @JsonProperty(JSON_PROPERTY_DIFFERENT_CURRENCIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDifferentCurrencies(DifferentCurrenciesRestriction differentCurrencies) {
    this.differentCurrencies = differentCurrencies;
  }


  public TransactionRuleRestrictions entryModes(EntryModesRestriction entryModes) {
    this.entryModes = entryModes;
    return this;
  }

   /**
   * Get entryModes
   * @return entryModes
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTRY_MODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EntryModesRestriction getEntryModes() {
    return entryModes;
  }


  @JsonProperty(JSON_PROPERTY_ENTRY_MODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntryModes(EntryModesRestriction entryModes) {
    this.entryModes = entryModes;
  }


  public TransactionRuleRestrictions internationalTransaction(InternationalTransactionRestriction internationalTransaction) {
    this.internationalTransaction = internationalTransaction;
    return this;
  }

   /**
   * Get internationalTransaction
   * @return internationalTransaction
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTERNATIONAL_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InternationalTransactionRestriction getInternationalTransaction() {
    return internationalTransaction;
  }


  @JsonProperty(JSON_PROPERTY_INTERNATIONAL_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInternationalTransaction(InternationalTransactionRestriction internationalTransaction) {
    this.internationalTransaction = internationalTransaction;
  }


  public TransactionRuleRestrictions matchingTransactions(MatchingTransactionsRestriction matchingTransactions) {
    this.matchingTransactions = matchingTransactions;
    return this;
  }

   /**
   * Get matchingTransactions
   * @return matchingTransactions
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATCHING_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MatchingTransactionsRestriction getMatchingTransactions() {
    return matchingTransactions;
  }


  @JsonProperty(JSON_PROPERTY_MATCHING_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchingTransactions(MatchingTransactionsRestriction matchingTransactions) {
    this.matchingTransactions = matchingTransactions;
  }


  public TransactionRuleRestrictions mccs(MccsRestriction mccs) {
    this.mccs = mccs;
    return this;
  }

   /**
   * Get mccs
   * @return mccs
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MCCS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MccsRestriction getMccs() {
    return mccs;
  }


  @JsonProperty(JSON_PROPERTY_MCCS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMccs(MccsRestriction mccs) {
    this.mccs = mccs;
  }


  public TransactionRuleRestrictions merchantNames(MerchantNamesRestriction merchantNames) {
    this.merchantNames = merchantNames;
    return this;
  }

   /**
   * Get merchantNames
   * @return merchantNames
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MERCHANT_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MerchantNamesRestriction getMerchantNames() {
    return merchantNames;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantNames(MerchantNamesRestriction merchantNames) {
    this.merchantNames = merchantNames;
  }


  public TransactionRuleRestrictions merchants(MerchantsRestriction merchants) {
    this.merchants = merchants;
    return this;
  }

   /**
   * Get merchants
   * @return merchants
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MERCHANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MerchantsRestriction getMerchants() {
    return merchants;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchants(MerchantsRestriction merchants) {
    this.merchants = merchants;
  }


  public TransactionRuleRestrictions processingTypes(ProcessingTypesRestriction processingTypes) {
    this.processingTypes = processingTypes;
    return this;
  }

   /**
   * Get processingTypes
   * @return processingTypes
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROCESSING_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProcessingTypesRestriction getProcessingTypes() {
    return processingTypes;
  }


  @JsonProperty(JSON_PROPERTY_PROCESSING_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessingTypes(ProcessingTypesRestriction processingTypes) {
    this.processingTypes = processingTypes;
  }


  public TransactionRuleRestrictions sameAmountRestriction(SameAmountRestriction sameAmountRestriction) {
    this.sameAmountRestriction = sameAmountRestriction;
    return this;
  }

   /**
   * Get sameAmountRestriction
   * @return sameAmountRestriction
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SAME_AMOUNT_RESTRICTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SameAmountRestriction getSameAmountRestriction() {
    return sameAmountRestriction;
  }


  @JsonProperty(JSON_PROPERTY_SAME_AMOUNT_RESTRICTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSameAmountRestriction(SameAmountRestriction sameAmountRestriction) {
    this.sameAmountRestriction = sameAmountRestriction;
  }


  public TransactionRuleRestrictions sameCounterpartyRestriction(SameCounterpartyRestriction sameCounterpartyRestriction) {
    this.sameCounterpartyRestriction = sameCounterpartyRestriction;
    return this;
  }

   /**
   * Get sameCounterpartyRestriction
   * @return sameCounterpartyRestriction
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SAME_COUNTERPARTY_RESTRICTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SameCounterpartyRestriction getSameCounterpartyRestriction() {
    return sameCounterpartyRestriction;
  }


  @JsonProperty(JSON_PROPERTY_SAME_COUNTERPARTY_RESTRICTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSameCounterpartyRestriction(SameCounterpartyRestriction sameCounterpartyRestriction) {
    this.sameCounterpartyRestriction = sameCounterpartyRestriction;
  }


  public TransactionRuleRestrictions timeOfDay(TimeOfDayRestriction timeOfDay) {
    this.timeOfDay = timeOfDay;
    return this;
  }

   /**
   * Get timeOfDay
   * @return timeOfDay
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIME_OF_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TimeOfDayRestriction getTimeOfDay() {
    return timeOfDay;
  }


  @JsonProperty(JSON_PROPERTY_TIME_OF_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeOfDay(TimeOfDayRestriction timeOfDay) {
    this.timeOfDay = timeOfDay;
  }


  public TransactionRuleRestrictions totalAmount(TotalAmountRestriction totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TotalAmountRestriction getTotalAmount() {
    return totalAmount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalAmount(TotalAmountRestriction totalAmount) {
    this.totalAmount = totalAmount;
  }


  /**
   * Return true if this TransactionRuleRestrictions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRuleRestrictions transactionRuleRestrictions = (TransactionRuleRestrictions) o;
    return Objects.equals(this.activeNetworkTokens, transactionRuleRestrictions.activeNetworkTokens) &&
        Objects.equals(this.brandVariants, transactionRuleRestrictions.brandVariants) &&
        Objects.equals(this.counterpartyBank, transactionRuleRestrictions.counterpartyBank) &&
        Objects.equals(this.countries, transactionRuleRestrictions.countries) &&
        Objects.equals(this.dayOfWeek, transactionRuleRestrictions.dayOfWeek) &&
        Objects.equals(this.differentCurrencies, transactionRuleRestrictions.differentCurrencies) &&
        Objects.equals(this.entryModes, transactionRuleRestrictions.entryModes) &&
        Objects.equals(this.internationalTransaction, transactionRuleRestrictions.internationalTransaction) &&
        Objects.equals(this.matchingTransactions, transactionRuleRestrictions.matchingTransactions) &&
        Objects.equals(this.mccs, transactionRuleRestrictions.mccs) &&
        Objects.equals(this.merchantNames, transactionRuleRestrictions.merchantNames) &&
        Objects.equals(this.merchants, transactionRuleRestrictions.merchants) &&
        Objects.equals(this.processingTypes, transactionRuleRestrictions.processingTypes) &&
        Objects.equals(this.sameAmountRestriction, transactionRuleRestrictions.sameAmountRestriction) &&
        Objects.equals(this.sameCounterpartyRestriction, transactionRuleRestrictions.sameCounterpartyRestriction) &&
        Objects.equals(this.timeOfDay, transactionRuleRestrictions.timeOfDay) &&
        Objects.equals(this.totalAmount, transactionRuleRestrictions.totalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeNetworkTokens, brandVariants, counterpartyBank, countries, dayOfWeek, differentCurrencies, entryModes, internationalTransaction, matchingTransactions, mccs, merchantNames, merchants, processingTypes, sameAmountRestriction, sameCounterpartyRestriction, timeOfDay, totalAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRuleRestrictions {\n");
    sb.append("    activeNetworkTokens: ").append(toIndentedString(activeNetworkTokens)).append("\n");
    sb.append("    brandVariants: ").append(toIndentedString(brandVariants)).append("\n");
    sb.append("    counterpartyBank: ").append(toIndentedString(counterpartyBank)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    differentCurrencies: ").append(toIndentedString(differentCurrencies)).append("\n");
    sb.append("    entryModes: ").append(toIndentedString(entryModes)).append("\n");
    sb.append("    internationalTransaction: ").append(toIndentedString(internationalTransaction)).append("\n");
    sb.append("    matchingTransactions: ").append(toIndentedString(matchingTransactions)).append("\n");
    sb.append("    mccs: ").append(toIndentedString(mccs)).append("\n");
    sb.append("    merchantNames: ").append(toIndentedString(merchantNames)).append("\n");
    sb.append("    merchants: ").append(toIndentedString(merchants)).append("\n");
    sb.append("    processingTypes: ").append(toIndentedString(processingTypes)).append("\n");
    sb.append("    sameAmountRestriction: ").append(toIndentedString(sameAmountRestriction)).append("\n");
    sb.append("    sameCounterpartyRestriction: ").append(toIndentedString(sameCounterpartyRestriction)).append("\n");
    sb.append("    timeOfDay: ").append(toIndentedString(timeOfDay)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

/**
   * Create an instance of TransactionRuleRestrictions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransactionRuleRestrictions
   * @throws JsonProcessingException if the JSON string is invalid with respect to TransactionRuleRestrictions
   */
  public static TransactionRuleRestrictions fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TransactionRuleRestrictions.class);
  }
/**
  * Convert an instance of TransactionRuleRestrictions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

