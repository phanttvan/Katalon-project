<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS002_Add_Store</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>e2941aef-a907-4ed2-a026-06eb8d47dd98</testSuiteGuid>
   <testCaseLink>
      <guid>519c7cdb-1679-492d-81d5-1a68b9f3f615</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC002_OpenBrowser</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>c67585a2-c0bc-481e-839d-083bb6f1f09d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC001_LoginShopify</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>90a6f63f-40bd-47f8-921a-d607a9dc52ee</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC003_AddStoreTest</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>aad1062f-2314-4b5b-bb47-3ecd728978f6</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/storename</testDataId>
      </testDataLink>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>e0272d03-5d82-4246-ade5-f8e70ce38143</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/storename</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>aad1062f-2314-4b5b-bb47-3ecd728978f6</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>storename</value>
         <variableId>ec7e0c3e-d9ed-483f-8695-6533c36a7424</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
