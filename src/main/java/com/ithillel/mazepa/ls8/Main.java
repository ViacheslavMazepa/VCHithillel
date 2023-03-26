package com.ithillel.mazepa.ls8;

public class Main {
    public static void main(String[] args) {
        //String a = "{\"id\": \"11578\", \"code\": \"\", \"name\": \"Test QA Dao\", \"author\": \"\", \"domain\": \"loopme.com\", \"legacy\": {\"rtb\": false, \"sspId\": 0, \"seatId\": \"\", \"allowSurveys\": true, \"isNewFlowTest\": false, \"showLoopmeBars\": false, \"maxSessionDepth\": 0, \"excludedBundleIds\": [], \"excludedSdkVersions\": [], \"readyForCampaignTraffic\": false, \"allowIncompleteSupplyChainTraffic\": false, \"allowBuysWithoutIabUserConsentString\": false}, \"status\": 3, \"comment\": \"\", \"version\": 48516, \"reporting\": {\"apiAuthToken\": \"7743c5491e6b496d\", \"usePrivateApi\": false}, \"updatedAt\": \"2023-03-17T12:33:17Z\", \"sellerJson\": {\"comment\": \"\", \"isPassthrough\": 0, \"isConfidential\": 0}, \"versionStr\": \"\", \"publisherId\": 11578, \"infoSettings\": {\"country\": \"GB\", \"currency\": \"\", \"companyName\": \"loopme_daotest\", \"roundtripEu\": 0, \"roundtripUs\": 0, \"contractCopy\": \"\", \"gdprSettings\": {\"gdprDpa\": \"\", \"isCcpaCompliant\": false, \"isGdprCompliant\": false, \"dataProcessorIds\": [], \"gdprContactEmail\": \"\", \"linkToPrivacyPolicy\": \"\"}, \"organization\": \"1\", \"registeredAt\": \"2023-03-17T12:33:17Z\", \"companyDomain\": \"loopme.com\", \"isTestAccount\": false, \"roundtripApac\": 0, \"availableFormat\": 0, \"defaultTimeZone\": \"\", \"isArchivedAccount\": false, \"clientToolLoginUrl\": \"\", \"loopmePublisherLead\": 0, \"isCookieSynchEnabled\": false, \"loopmeAccountManager\": 0, \"publisherAccountType\": 1, \"isGooglePlayCertified\": false, \"isNotUsePublisherData\": false, \"loopmePublisherLeadId\": \"\", \"isAvailableForCampaign\": true, \"loopmeAccountManagerId\": \"\", \"clientAccountManagerEmail\": \"\", \"isPrivateTermsAndConditions\": false, \"clientAccountManagerLastName\": \"\", \"clientAccountManagerFirstName\": \"\", \"isMoatViewabilityTileAvailable\": false}, \"resourceName\": \"\", \"prebidFilters\": {\"allowedNonAdsTxtBuys\": [], \"isAllowIncompleteSupplyChainTraffic\": true}, \"extPublisherId\": \"\", \"billingSettings\": {\"price\": 0.0, \"discount\": 0.0, \"userRoleId\": 0, \"paymentTerms\": 0, \"pricingModelId\": 0, \"defaultBidFloor\": 0.0, \"priceMultiplier\": 1.0}, \"exchangeSettings\": {\"isOmpAllowed\": false, \"isPmpEnabled\": false, \"selectedOmpDspIds\": [], \"selectedPmpDspIds\": [], \"advertiserWhitelist\": false}, \"inventoryManagement\": {\"type\": 1, \"tagId\": \"\", \"nodesLimit\": 0, \"obsoleteType\": 0, \"sellerDunsId\": \"\", \"hasSellerJson\": true}, \"targetingSupplement\": {\"maxAdmSize\": 0, \"isPmpEnabled\": false, \"blockedGenreIds\": [], \"blockedAgeRatings\": [], \"blockedAdContentIds\": [], \"blockedIabCategories\": [], \"isOpenExchangeAllowed\": false, \"selectedDspIdsPmpOnly\": [], \"blockedAdContentIdsOld\": [], \"allowedNonAppAdsTxtBuys\": [], \"blockedBrandVerticalIds\": [], \"blockedAdvertiserDomains\": [], \"selectedDspIdsOpenMarket\": []}, \"userConsentSettings\": {\"allowBuysWithoutUserConsent\": false, \"allowBuysWithoutLoopmeUserConsent\": false, \"allowBuysWithoutIabUserConsentString\": false}, \"configurationSettings\": {\"useBurl\": false, \"priceMacros\": \"${AUCTION_PRICE}\", \"useImptrackers\": false, \"gzipCompressionEnabled\": false}}";
        //System.out.println(a.replaceAll(",", "\n"));
        String str1 = "Hello";
        String str2 = "W";

        System.out.println(lastChars(str1, str2));
    }
    public static String right2(String str) {
        return str.substring(2,str.length()) + str.substring(0, 2);
    }
    public static String lastChars(String a, String b) {
        String add = "@";
        if(a.length() == 1){
            a = a + add;
        }else if (a.length() == 0){
            a = add + add;
        }
        if(b.length() == 1){
            b = b + add;
        }else if (b.length() == 0){
            b = add + add;
        }
        return a.substring(0,2) + b.substring(0,2);}
}

