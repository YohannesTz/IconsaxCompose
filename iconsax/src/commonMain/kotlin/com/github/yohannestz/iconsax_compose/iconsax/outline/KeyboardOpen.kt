package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val KeyboardOpen: ImageVector
    get() {
        val current = _keyboardOpen
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.KeyboardOpen",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.74f, y = 19.59f)
                horizontalLineTo(x = 7.27f)
                curveToRelative(dx1 = -0.79f, dy1 = 0.0f, dx2 = -1.36f, dy2 = -0.03f, dx3 = -1.85f, dy3 = -0.1f)
                curveToRelative(dx1 = -3.47f, dy1 = -0.38f, dx2 = -4.16f, dy2 = -2.46f, dx3 = -4.16f, dy3 = -5.91f)
                verticalLineTo(y = 7.26f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.45f, dx2 = 0.68f, dy2 = -5.53f, dx3 = 4.18f, dy3 = -5.91f)
                arcToRelative(a = 13.0f, b = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.83f, dy1 = -0.1f)
                horizontalLineToRelative(dx = 9.47f)
                arcToRelative(a = 13.0f, b = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.85f, dy1 = 0.1f)
                curveToRelative(dx1 = 3.48f, dy1 = 0.38f, dx2 = 4.16f, dy2 = 2.46f, dx3 = 4.16f, dy3 = 5.91f)
                verticalLineToRelative(dy = 6.32f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.45f, dx2 = -0.68f, dy2 = 5.53f, dx3 = -4.18f, dy3 = 5.91f)
                arcToRelative(a = 13.0f, b = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.83f, dy1 = 0.1f)
                moveTo(x = 7.26f, y = 2.75f)
                curveToRelative(dx1 = -0.71f, dy1 = 0.0f, dx2 = -1.22f, dy2 = 0.03f, dx3 = -1.64f, dy3 = 0.09f)
                curveToRelative(dx1 = -2.16f, dy1 = 0.24f, dx2 = -2.87f, dy2 = 0.91f, dx3 = -2.87f, dy3 = 4.43f)
                verticalLineToRelative(dy = 6.32f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.51f, dx2 = 0.71f, dy2 = 4.19f, dx3 = 2.85f, dy3 = 4.42f)
                arcToRelative(a = 12.0f, b = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.67f, dy1 = 0.09f)
                horizontalLineToRelative(dx = 9.47f)
                curveToRelative(dx1 = 0.72f, dy1 = 0.0f, dx2 = 1.22f, dy2 = -0.03f, dx3 = 1.64f, dy3 = -0.09f)
                curveToRelative(dx1 = 2.16f, dy1 = -0.24f, dx2 = 2.87f, dy2 = -0.91f, dx3 = 2.87f, dy3 = -4.43f)
                verticalLineTo(y = 7.26f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.51f, dx2 = -0.71f, dy2 = -4.19f, dx3 = -2.85f, dy3 = -4.42f)
                arcToRelative(a = 12.0f, b = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.67f, dy1 = -0.09f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.26f, y = 9.07f)
                horizontalLineToRelative(dx = -3.68f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 3.68f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                moveTo(x = 10.0f, y = 9.32f)
                curveToRelative(dx1 = -0.55f, dy1 = 0.0f, dx2 = -1.0f, dy2 = -0.45f, dx3 = -1.0f, dy3 = -1.0f)
                reflectiveCurveToRelative(dx1 = 0.44f, dy1 = -1.0f, dx2 = 1.0f, dy2 = -1.0f)
                curveToRelative(dx1 = 0.55f, dy1 = 0.0f, dx2 = 1.0f, dy2 = 0.45f, dx3 = 1.0f, dy3 = 1.0f)
                reflectiveCurveToRelative(dx1 = -0.44f, dy1 = 1.0f, dx2 = -1.0f, dy2 = 1.0f)
                moveToRelative(dx = -3.15f, dy = 0.0f)
                curveToRelative(dx1 = -0.55f, dy1 = 0.0f, dx2 = -1.0f, dy2 = -0.45f, dx3 = -1.0f, dy3 = -1.0f)
                reflectiveCurveToRelative(dx1 = 0.44f, dy1 = -1.0f, dx2 = 1.0f, dy2 = -1.0f)
                horizontalLineToRelative(dx = 0.01f)
                curveToRelative(dx1 = 0.55f, dy1 = 0.0f, dx2 = 1.0f, dy2 = 0.45f, dx3 = 1.0f, dy3 = 1.0f)
                reflectiveCurveToRelative(dx1 = -0.46f, dy1 = 1.0f, dx2 = -1.01f, dy2 = 1.0f)
                moveToRelative(dx = 10.41f, dy = 5.54f)
                horizontalLineTo(x = 6.75f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.76f, dy2 = -0.34f, dx3 = -0.76f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.33f, dy1 = -0.75f, dx2 = 0.74f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 10.53f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                moveTo(x = 17.0f, y = 22.75f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 6.59f, y1 = 21.25f, x2 = 7.0f, y2 = 21.25f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _keyboardOpen = it }
    }

@Suppress("ObjectPropertyName")
private var _keyboardOpen: ImageVector? = null
