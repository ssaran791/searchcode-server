/*
 * Copyright (c) 2016 Boyter Online Services
 *
 * Use of this software is governed by the Fair Source License included
 * in the LICENSE.TXT file, but will be eventually open under GNU General Public License Version 3
 * see the README.md for when this clause will take effect
 *
 * Version 1.3.2
 */

package com.searchcode.app.service;


public interface IJobService {
    void initialJobs();
    boolean rebuildAll();
    boolean forceEnqueue();
}
