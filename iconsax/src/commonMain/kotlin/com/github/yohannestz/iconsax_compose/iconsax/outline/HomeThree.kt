package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HomeThree: ImageVector
    get() {
        val current = _homeThree
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HomeThree",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.6f, y = 22.56f)
                horizontalLineTo(x = 6.4f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.78f, dy1 = -3.2f)
                lineTo(x = 1.29f, y = 11.4f)
                arcToRelative(a = 4.1f, b = 4.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.38f, dy1 = -3.62f)
                lineTo(x = 9.6f, y = 2.23f)
                arcToRelative(a = 3.96f, b = 3.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.8f, dy1 = 0.01f)
                lineToRelative(dx = 6.93f, dy = 5.54f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.38f, dy1 = 3.62f)
                lineToRelative(dx = -1.33f, dy = 7.96f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.78f, dy1 = 3.2f)
                moveTo(x = 11.99f, y = 2.94f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.45f, dy1 = 0.47f)
                lineTo(x = 3.61f, y = 8.96f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.84f, dy1 = 2.2f)
                lineToRelative(dx = 1.33f, dy = 7.96f)
                arcToRelative(a = 2.45f, b = 2.45f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.3f, dy1 = 1.94f)
                horizontalLineToRelative(dx = 11.2f)
                arcToRelative(a = 2.45f, b = 2.45f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.3f, dy1 = -1.95f)
                lineToRelative(dx = 1.33f, dy = -7.96f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.84f, dy1 = -2.2f)
                lineToRelative(dx = -6.93f, dy = -5.54f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.47f, dy1 = -0.47f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 16.25f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -6.5f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 6.5f)
                moveToRelative(dx = 0.0f, dy = -5.0f)
                curveToRelative(dx1 = -0.96f, dy1 = 0.0f, dx2 = -1.75f, dy2 = 0.79f, dx3 = -1.75f, dy3 = 1.75f)
                reflectiveCurveToRelative(dx1 = 0.79f, dy1 = 1.75f, dx2 = 1.75f, dy2 = 1.75f)
                reflectiveCurveToRelative(dx1 = 1.75f, dy1 = -0.79f, dx2 = 1.75f, dy2 = -1.75f)
                reflectiveCurveToRelative(dx1 = -0.79f, dy1 = -1.75f, dx2 = -1.75f, dy2 = -1.75f)
            }
        }.build().also { _homeThree = it }
    }

@Suppress("ObjectPropertyName")
private var _homeThree: ImageVector? = null
