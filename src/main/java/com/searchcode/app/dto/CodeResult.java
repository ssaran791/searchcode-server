/*
 * Copyright (c) 2016 Boyter Online Services
 *
 * Use of this software is governed by the Fair Source License included
 * in the LICENSE.TXT file, but will be eventually open under GNU General Public License Version 3
 * see the README.md for when this clause will take effect
 *
 * Version 1.3.2
 */

package com.searchcode.app.dto;

import java.util.ArrayList;
import java.util.List;

// Holds a result after a search with full text
// and metadata
public class CodeResult {
    public List<String> code = new ArrayList<>();
    public List<CodeMatchResult> matchingResults = new ArrayList<>();
    public String codePath = "";
    public String fileName = "";
    public String fileLocation = "";
    public String md5hash = "";
    public String languageName = "";
    public String codeLines = "";
    public int documentId = 0;
    public String repoName = "";
    public String repoLocation = "";
    public String codeOwner = "";
    public String codeId = "";

    public CodeResult(List<String> code, List<CodeMatchResult>matchingResults) {
        this.setCode(code);
        this.setMatchingResults(matchingResults);
    }

    public List<String> getCode() {
        return code;
    }

    public void setCode(List<String> code) {
        this.code = code;
    }

    public List<CodeMatchResult> getMatchingResults() {
        return matchingResults;
    }

    public void setMatchingResults(List<CodeMatchResult> matchingResults) {
        this.matchingResults = matchingResults;
    }

    public String getCodePath() {
        return codePath;
    }

    public void setCodePath(String codePath) {
        this.codePath = codePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public String getMd5hash() {
        return md5hash;
    }

    public void setMd5hash(String md5hash) {
        this.md5hash = md5hash;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public String getCodeLines() {
        return codeLines;
    }

    public void setCodeLines(String codeLines) {
        this.codeLines = codeLines;
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public String getRepoLocation() {
        return repoLocation;
    }

    public void setRepoLocation(String repoLocation) {
        this.repoLocation = repoLocation;
    }

    public String getCodeOwner() {
        return codeOwner;
    }

    public void setCodeOwner(String codeOwner) {
        this.codeOwner = codeOwner;
    }

    public String getCodeId() {
        return codeId;
    }

    public void setCodeId(String codeId) {
        this.codeId = codeId;
    }
}
