package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AlignTop: ImageVector
    get() {
        val current = _alignTop
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.AlignTop",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.03f, y = 19.75f)
                horizontalLineToRelative(dx = -1.04f)
                quadToRelative(dx1 = -3.0f, dy1 = 0.02f, dx2 = -2.98f, dy2 = -2.85f)
                verticalLineTo(y = 5.1f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 11.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.01f, dx2 = 0.21f, dy2 = 1.35f, dx3 = 1.48f, dy3 = 1.35f)
                horizontalLineToRelative(dx = 1.04f)
                curveToRelative(dx1 = 1.27f, dy1 = 0.0f, dx2 = 1.48f, dy2 = -0.34f, dx3 = 1.48f, dy3 = -1.35f)
                verticalLineTo(y = 5.1f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 11.8f)
                quadToRelative(dx1 = 0.02f, dy1 = 2.87f, dx2 = -2.98f, dy2 = 2.85f)
                moveToRelative(dx = -8.5f, dy = -5.0f)
                horizontalLineTo(x = 7.49f)
                quadToRelative(dx1 = -3.0f, dy1 = 0.01f, dx2 = -2.98f, dy2 = -2.85f)
                verticalLineTo(y = 5.1f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 6.01f, y1 = 4.7f, x2 = 6.01f, y2 = 5.1f)
                verticalLineToRelative(dy = 6.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.01f, dx2 = 0.21f, dy2 = 1.35f, dx3 = 1.48f, dy3 = 1.35f)
                horizontalLineToRelative(dx = 1.04f)
                curveToRelative(dx1 = 1.27f, dy1 = 0.0f, dx2 = 1.48f, dy2 = -0.34f, dx3 = 1.48f, dy3 = -1.35f)
                verticalLineTo(y = 5.1f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 6.8f)
                quadToRelative(dx1 = 0.02f, dy1 = 2.86f, dx2 = -2.98f, dy2 = 2.85f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 5.75f)
                horizontalLineTo(x = 2.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                horizontalLineToRelative(dx = 20.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
            }
        }.build().also { _alignTop = it }
    }

@Suppress("ObjectPropertyName")
private var _alignTop: ImageVector? = null
