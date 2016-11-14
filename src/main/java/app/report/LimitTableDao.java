
/*
 Copyright (C) 2016 Quaternion Risk Management Ltd
 All rights reserved.

 This file is part of ORE, a free-software/open-source library
 for transparent pricing and risk analysis - http://opensourcerisk.org

 ORE is free software: you can redistribute it and/or modify it
 under the terms of the Modified BSD License.  You should have received a
 copy of the license along with this program.
 The license is also available online at <http://opensourcerisk.org>

 This program is distributed on the basis that it will form a useful
 contribution to risk analytics and model standardisation, but WITHOUT
 ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 FITNESS FOR A PARTICULAR PURPOSE. See the license for more details.
*/

package app.report;

import java.util.*;

import app.util.DashBoardException;
import static app.Application.cache;

/**
 * Created by quaternion on 16/09/2016.
 */
public class LimitTableDao {

    Set<String> getTotalPortfolioLinks() {
        return cache.getTotalPortfolioLinks();
    }

    List<LimitTableEntry> getTotalPortfolio(String metric) throws DashBoardException {
        return cache.getTotalPortfolio(metric);
    }

    List<LimitTableEntry> getLimitBreaches() {
        return cache.getLimitBreaches();
    }
}

