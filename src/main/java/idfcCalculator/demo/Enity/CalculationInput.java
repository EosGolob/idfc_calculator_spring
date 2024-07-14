package idfcCalculator.demo.Enity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CalculationInput {
    private int newEMIWithIDFCOnProposedVehicle;
    private int otherFixedEMIExcCurrentProposedCarLoanEMI;
    private int salaryOrIncome;
    private int currentYear;
    private String selectedEmploymentType;
    private int selectedModelYear;
    private int selectedLoanTenure;
    private int selectOwner;
    private String finalTiercom;
    private int currentloanTenure;

    // Getters and Setters
}
