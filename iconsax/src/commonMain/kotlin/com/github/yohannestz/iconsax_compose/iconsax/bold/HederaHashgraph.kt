package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HederaHashgraph: ImageVector
    get() {
        val current = _hederaHashgraph
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HederaHashgraph",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 15.0f, y = 10.88f)
                horizontalLineTo(x = 9.0f)
                verticalLineToRelative(dy = 2.25f)
                horizontalLineToRelative(dx = 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                moveToRelative(dx = 4.5f, dy = 14.5f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 15.0f, y1 = 16.91f, x2 = 15.0f, y2 = 16.5f)
                verticalLineToRelative(dy = -1.88f)
                horizontalLineTo(x = 9.0f)
                verticalLineToRelative(dy = 1.88f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 7.5f, y1 = 16.91f, x2 = 7.5f, y2 = 16.5f)
                verticalLineToRelative(dy = -9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 9.0f, y1 = 7.09f, x2 = 9.0f, y2 = 7.5f)
                verticalLineToRelative(dy = 1.88f)
                horizontalLineToRelative(dx = 6.0f)
                verticalLineTo(y = 7.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 16.5f, y1 = 7.09f, x2 = 16.5f, y2 = 7.5f)
                close()
            }
        }.build().also { _hederaHashgraph = it }
    }

@Suppress("ObjectPropertyName")
private var _hederaHashgraph: ImageVector? = null
