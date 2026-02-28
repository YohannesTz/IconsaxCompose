package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArchiveBox: ImageVector
    get() {
        val current = _archiveBox
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArchiveBox",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.5f, y = 22.75f)
                horizontalLineToRelative(dx = -9.0f)
                curveToRelative(dx1 = -3.3f, dy1 = 0.0f, dx2 = -3.75f, dy2 = -1.8f, dx3 = -3.75f, dy3 = -3.75f)
                verticalLineToRelative(dy = -8.78f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineTo(y = 19.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.74f, dx2 = 0.3f, dy2 = 2.25f, dx3 = 2.25f, dy3 = 2.25f)
                horizontalLineToRelative(dx = 9.0f)
                curveToRelative(dx1 = 1.95f, dy1 = 0.0f, dx2 = 2.25f, dy2 = -0.51f, dx3 = 2.25f, dy3 = -2.25f)
                verticalLineToRelative(dy = -8.78f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineTo(y = 19.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.95f, dx2 = -0.45f, dy2 = 3.75f, dx3 = -3.75f, dy3 = 3.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.0f, y = 10.75f)
                horizontalLineTo(x = 5.0f)
                curveToRelative(dx1 = -2.42f, dy1 = 0.0f, dx2 = -3.75f, dy2 = -1.33f, dx3 = -3.75f, dy3 = -3.75f)
                verticalLineTo(y = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.42f, dx2 = 1.33f, dy2 = -3.75f, dx3 = 3.75f, dy3 = -3.75f)
                horizontalLineToRelative(dx = 14.0f)
                curveToRelative(dx1 = 2.42f, dy1 = 0.0f, dx2 = 3.75f, dy2 = 1.33f, dx3 = 3.75f, dy3 = 3.75f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.42f, dx2 = -1.33f, dy2 = 3.75f, dx3 = -3.75f, dy3 = 3.75f)
                moveToRelative(dx = -14.0f, dy = -8.0f)
                curveTo(x1 = 3.42f, y1 = 2.75f, x2 = 2.75f, y2 = 3.42f, x3 = 2.75f, y3 = 5.0f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.58f, dx2 = 0.67f, dy2 = 2.25f, dx3 = 2.25f, dy3 = 2.25f)
                horizontalLineToRelative(dx = 14.0f)
                curveToRelative(dx1 = 1.58f, dy1 = 0.0f, dx2 = 2.25f, dy2 = -0.67f, dx3 = 2.25f, dy3 = -2.25f)
                verticalLineTo(y = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.58f, dx2 = -0.67f, dy2 = -2.25f, dx3 = -2.25f, dy3 = -2.25f)
                close()
                moveToRelative(dx = 8.82f, dy = 12.0f)
                horizontalLineToRelative(dx = -3.64f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 3.64f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _archiveBox = it }
    }

@Suppress("ObjectPropertyName")
private var _archiveBox: ImageVector? = null
