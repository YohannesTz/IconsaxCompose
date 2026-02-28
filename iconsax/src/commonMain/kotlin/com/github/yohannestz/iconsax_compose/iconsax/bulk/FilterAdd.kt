package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FilterAdd: ImageVector
    get() {
        val current = _filterAdd
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FilterAdd",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 5.41f, y = 2.0f)
                horizontalLineToRelative(dx = 13.17f)
                curveToRelative(dx1 = 1.1f, dy1 = 0.0f, dx2 = 2.0f, dy2 = 0.91f, dx3 = 2.0f, dy3 = 2.02f)
                verticalLineToRelative(dy = 2.22f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.81f, dx2 = -0.5f, dy2 = 1.82f, dx3 = -1.0f, dy3 = 2.32f)
                lineToRelative(dx = -4.29f, dy = 3.84f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = 2.32f)
                verticalLineToRelative(dy = 4.34f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.61f, dx2 = -0.4f, dy2 = 1.41f, dx3 = -0.9f, dy3 = 1.72f)
                lineTo(x = 12.0f, y = 21.7f)
                arcToRelative(a = 2.03f, b = 2.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.09f, dy1 = -1.72f)
                verticalLineToRelative(dy = -5.35f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.8f, dy1 = -2.12f)
                lineTo(x = 4.32f, y = 8.47f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.9f, dy1 = -2.02f)
                verticalLineTo(y = 4.13f)
                curveTo(x1 = 3.42f, y1 = 2.91f, x2 = 4.32f, y2 = 2.0f, x3 = 5.41f, y3 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.88f, y = 10.0f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 9.5f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -9.5f)
                moveToRelative(dx = 1.78f, dy = 5.48f)
                horizontalLineToRelative(dx = -1.03f)
                verticalLineToRelative(dy = 1.07f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -1.07f)
                horizontalLineToRelative(dx = -1.02f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 1.02f)
                verticalLineTo(y = 13.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 0.98f)
                horizontalLineToRelative(dx = 1.03f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _filterAdd = it }
    }

@Suppress("ObjectPropertyName")
private var _filterAdd: ImageVector? = null
