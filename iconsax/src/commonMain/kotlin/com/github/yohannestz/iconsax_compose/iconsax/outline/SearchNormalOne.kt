package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SearchNormalOne: ImageVector
    get() {
        val current = _searchNormalOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SearchNormalOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.5f, y = 21.75f)
                curveToRelative(dx1 = -5.65f, dy1 = 0.0f, dx2 = -10.25f, dy2 = -4.6f, dx3 = -10.25f, dy3 = -10.25f)
                reflectiveCurveTo(x1 = 5.85f, y1 = 1.25f, x2 = 11.5f, y2 = 1.25f)
                reflectiveCurveToRelative(dx1 = 10.25f, dy1 = 4.6f, dx2 = 10.25f, dy2 = 10.25f)
                reflectiveCurveToRelative(dx1 = -4.6f, dy1 = 10.25f, dx2 = -10.25f, dy2 = 10.25f)
                moveToRelative(dx = 0.0f, dy = -19.0f)
                arcToRelative(a = 8.76f, b = 8.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 17.5f)
                arcToRelative(a = 8.76f, b = 8.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -17.5f)
                moveToRelative(dx = 10.5f, dy = 20.0f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                lineToRelative(dx = -2.0f, dy = -2.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                lineToRelative(dx = 2.0f, dy = 2.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = 0.22f)
            }
        }.build().also { _searchNormalOne = it }
    }

@Suppress("ObjectPropertyName")
private var _searchNormalOne: ImageVector? = null
