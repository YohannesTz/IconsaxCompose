package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AlignRight: ImageVector
    get() {
        val current = _alignRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.AlignRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.9f, y = 20.0f)
                horizontalLineTo(x = 7.1f)
                quadToRelative(dx1 = -2.86f, dy1 = 0.01f, dx2 = -2.85f, dy2 = -2.98f)
                verticalLineToRelative(dy = -1.04f)
                quadTo(x1 = 4.23f, y1 = 12.99f, x2 = 7.1f, y2 = 13.0f)
                horizontalLineToRelative(dx = 11.8f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                horizontalLineTo(x = 7.1f)
                curveToRelative(dx1 = -1.01f, dy1 = 0.0f, dx2 = -1.35f, dy2 = 0.21f, dx3 = -1.35f, dy3 = 1.48f)
                verticalLineToRelative(dy = 1.04f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.27f, dx2 = 0.34f, dy2 = 1.48f, dx3 = 1.35f, dy3 = 1.48f)
                horizontalLineToRelative(dx = 11.8f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 19.31f, y1 = 20.0f, x2 = 18.9f, y2 = 20.0f)
                moveToRelative(dx = 0.0f, dy = -8.5f)
                horizontalLineToRelative(dx = -6.8f)
                quadToRelative(dx1 = -2.87f, dy1 = 0.01f, dx2 = -2.85f, dy2 = -2.98f)
                verticalLineTo(y = 7.48f)
                quadToRelative(dx1 = -0.02f, dy1 = -3.0f, dx2 = 2.85f, dy2 = -2.98f)
                horizontalLineToRelative(dx = 6.8f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 19.31f, y1 = 6.0f, x2 = 18.9f, y2 = 6.0f)
                horizontalLineToRelative(dx = -6.8f)
                curveToRelative(dx1 = -1.01f, dy1 = 0.0f, dx2 = -1.35f, dy2 = 0.21f, dx3 = -1.35f, dy3 = 1.48f)
                verticalLineToRelative(dy = 1.04f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.27f, dx2 = 0.34f, dy2 = 1.48f, dx3 = 1.35f, dy3 = 1.48f)
                horizontalLineToRelative(dx = 6.8f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.0f, y = 22.74f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineToRelative(dy = -20.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 20.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 19.0f, y1 = 22.74f)
            }
        }.build().also { _alignRight = it }
    }

@Suppress("ObjectPropertyName")
private var _alignRight: ImageVector? = null
