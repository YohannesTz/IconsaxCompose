package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BuildingThree: ImageVector
    get() {
        val current = _buildingThree
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BuildingThree",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.0f, y = 7.07f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.89f, dy1 = -1.66f)
                lineToRelative(dx = -4.0f, dy = -2.67f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.22f, dy1 = 0.0f)
                lineToRelative(dx = -4.0f, dy = 2.67f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 3.0f, y1 = 7.07f)
                verticalLineToRelative(dy = 5.68f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.5f, dy1 = 0.5f)
                horizontalLineToRelative(dx = 11.0f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.5f, dy1 = -0.5f)
                close()
                moveToRelative(dx = -6.0f, dy = 3.68f)
                curveToRelative(dx1 = -0.96f, dy1 = 0.0f, dx2 = -1.75f, dy2 = -0.79f, dx3 = -1.75f, dy3 = -1.75f)
                reflectiveCurveTo(x1 = 8.04f, y1 = 7.25f, x2 = 9.0f, y2 = 7.25f)
                reflectiveCurveTo(x1 = 10.75f, y1 = 8.04f, x2 = 10.75f, y2 = 9.0f)
                reflectiveCurveTo(x1 = 9.96f, y1 = 10.75f, x2 = 9.0f, y2 = 10.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 21.25f)
                horizontalLineToRelative(dx = -1.27f)
                verticalLineToRelative(dy = -3.0f)
                arcTo(horizontalEllipseRadius = 2.4f, verticalEllipseRadius = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.37f, y1 = 16.0f)
                verticalLineToRelative(dy = -2.0f)
                arcToRelative(a = 2.39f, b = 2.39f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.76f, dy1 = 0.0f)
                verticalLineToRelative(dy = 2.0f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.61f, dy1 = 2.24f)
                verticalLineToRelative(dy = 3.01f)
                horizontalLineTo(x = 15.0f)
                verticalLineToRelative(dy = -6.0f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.5f, dy1 = -0.5f)
                horizontalLineToRelative(dx = -11.0f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.5f, dy1 = 0.5f)
                verticalLineToRelative(dy = 6.0f)
                horizontalLineTo(x = 2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 1.59f, y1 = 22.75f, x2 = 2.0f, y2 = 22.75f)
                horizontalLineToRelative(dx = 17.93f)
                lineToRelative(dx = 0.05f, dy = 0.01f)
                horizontalLineTo(x = 22.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.35f, dx3 = 0.75f, dy3 = -0.76f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = -0.75f, dx2 = -0.75f, dy2 = -0.75f)
                moveToRelative(dx = -13.75f, dy = -3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 3.0f)
                horizontalLineToRelative(dx = -1.5f)
                close()
            }
        }.build().also { _buildingThree = it }
    }

@Suppress("ObjectPropertyName")
private var _buildingThree: ImageVector? = null
