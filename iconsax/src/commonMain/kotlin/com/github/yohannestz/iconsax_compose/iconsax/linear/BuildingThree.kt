package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 22.0f)
                horizontalLineToRelative(dx = 20.0f)
                moveToRelative(dx = -6.99f, dy = -0.01f)
                lineToRelative(dx = -12.0f, dy = 0.02f)
                lineTo(x = 3.0f, y = 7.07f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.89f, dy1 = -1.66f)
                lineToRelative(dx = 4.0f, dy = -2.67f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.22f, dy1 = 0.0f)
                lineToRelative(dx = 4.0f, dy = 2.67f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.0f, y1 = 7.07f)
                close()
                moveToRelative(dx = 4.97f, dy = 0.02f)
                verticalLineTo(y = 18.0f)
                moveTo(x = 20.0f, y = 12.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.0f, dy1 = 2.0f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.1f, dx2 = 0.9f, dy2 = 2.0f, dx3 = 2.0f, dy3 = 2.0f)
                reflectiveCurveToRelative(dx1 = 2.0f, dy1 = -0.9f, dx2 = 2.0f, dy2 = -2.0f)
                verticalLineToRelative(dy = -2.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.0f, dy1 = -2.0f)
                moveTo(x = 3.0f, y = 14.0f)
                horizontalLineToRelative(dx = 12.0f)
                moveToRelative(dx = -6.0f, dy = 8.0f)
                verticalLineToRelative(dy = -3.75f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.0f, y = 10.5f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.0f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.0f)
            }
        }.build().also { _buildingThree = it }
    }

@Suppress("ObjectPropertyName")
private var _buildingThree: ImageVector? = null
