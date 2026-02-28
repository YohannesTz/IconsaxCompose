package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RecordCircle: ImageVector
    get() {
        val current = _recordCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.RecordCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.97f, y = 22.75f)
                curveTo(x1 = 6.05f, y1 = 22.75f, x2 = 1.22f, y2 = 17.93f, x3 = 1.22f, y3 = 12.0f)
                reflectiveCurveTo(x1 = 6.05f, y1 = 1.25f, x2 = 11.97f, y2 = 1.25f)
                reflectiveCurveTo(x1 = 22.72f, y1 = 6.07f, x2 = 22.72f, y2 = 12.0f)
                reflectiveCurveTo(x1 = 17.9f, y1 = 22.75f, x2 = 11.97f, y2 = 22.75f)
                moveToRelative(dx = 0.0f, dy = -20.0f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 18.5f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -18.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 16.98f)
                arcToRelative(a = 4.98f, b = 4.98f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -9.96f)
                arcToRelative(a = 4.98f, b = 4.98f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 9.96f)
                close()
                moveToRelative(dx = 0.0f, dy = -8.46f)
                arcToRelative(a = 3.48f, b = 3.48f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.97f)
                arcToRelative(a = 3.48f, b = 3.48f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.97f)
            }
        }.build().also { _recordCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _recordCircle: ImageVector? = null
