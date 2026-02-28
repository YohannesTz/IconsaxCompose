package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AlignLeft: ImageVector
    get() {
        val current = _alignLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.AlignLeft",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.9f, y = 20.0f)
                horizontalLineTo(x = 5.1f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 4.69f, y1 = 18.5f, x2 = 5.1f, y2 = 18.5f)
                horizontalLineToRelative(dx = 11.8f)
                curveToRelative(dx1 = 1.01f, dy1 = 0.0f, dx2 = 1.35f, dy2 = -0.21f, dx3 = 1.35f, dy3 = -1.48f)
                verticalLineToRelative(dy = -1.04f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.27f, dx2 = -0.34f, dy2 = -1.48f, dx3 = -1.35f, dy3 = -1.48f)
                horizontalLineTo(x = 5.1f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 4.69f, y1 = 13.0f, x2 = 5.1f, y2 = 13.0f)
                horizontalLineToRelative(dx = 11.8f)
                quadToRelative(dx1 = 2.87f, dy1 = -0.01f, dx2 = 2.85f, dy2 = 2.98f)
                verticalLineToRelative(dy = 1.04f)
                quadToRelative(dx1 = 0.02f, dy1 = 2.99f, dx2 = -2.85f, dy2 = 2.98f)
                moveToRelative(dx = -5.0f, dy = -8.5f)
                horizontalLineTo(x = 5.1f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 4.69f, y1 = 10.0f, x2 = 5.1f, y2 = 10.0f)
                horizontalLineToRelative(dx = 6.8f)
                curveToRelative(dx1 = 1.01f, dy1 = 0.0f, dx2 = 1.35f, dy2 = -0.21f, dx3 = 1.35f, dy3 = -1.48f)
                verticalLineTo(y = 7.48f)
                curveTo(x1 = 13.25f, y1 = 6.21f, x2 = 12.91f, y2 = 6.0f, x3 = 11.9f, y3 = 6.0f)
                horizontalLineTo(x = 5.1f)
                curveTo(x1 = 4.69f, y1 = 6.0f, x2 = 4.35f, y2 = 5.66f, x3 = 4.35f, y3 = 5.25f)
                reflectiveCurveTo(x1 = 4.69f, y1 = 4.5f, x2 = 5.1f, y2 = 4.5f)
                horizontalLineToRelative(dx = 6.8f)
                quadToRelative(dx1 = 2.86f, dy1 = -0.01f, dx2 = 2.85f, dy2 = 2.98f)
                verticalLineToRelative(dy = 1.04f)
                quadToRelative(dx1 = 0.01f, dy1 = 2.99f, dx2 = -2.85f, dy2 = 2.98f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 5.0f, y = 22.74f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineToRelative(dy = -20.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 20.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.0f, y1 = 22.74f)
            }
        }.build().also { _alignLeft = it }
    }

@Suppress("ObjectPropertyName")
private var _alignLeft: ImageVector? = null
