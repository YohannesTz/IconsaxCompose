package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 12.0f, y = 24.0f)
                arcToRelative(a = 12.0f, b = 12.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -24.0f)
                arcToRelative(a = 12.0f, b = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 24.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.5f, y = 18.3f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.9f, dy1 = -0.9f)
                verticalLineTo(y = 6.6f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.5f, dx2 = 0.4f, dy2 = -0.9f, dx3 = 0.9f, dy3 = -0.9f)
                reflectiveCurveToRelative(dx1 = 0.9f, dy1 = 0.4f, dx2 = 0.9f, dy2 = 0.9f)
                verticalLineToRelative(dy = 10.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.5f, dx2 = -0.4f, dy2 = 0.9f, dx3 = -0.9f, dy3 = 0.9f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.5f, y = 15.14f)
                horizontalLineToRelative(dx = -9.0f)
                curveToRelative(dx1 = -0.5f, dy1 = 0.0f, dx2 = 0.1f, dy2 = -0.4f, dx3 = 0.1f, dy3 = -0.9f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.49f, dx2 = -0.6f, dy2 = -0.9f, dx3 = -0.1f, dy3 = -0.9f)
                horizontalLineToRelative(dx = 9.0f)
                curveToRelative(dx1 = 0.5f, dy1 = 0.0f, dx2 = 0.9f, dy2 = 0.41f, dx3 = 0.9f, dy3 = 0.9f)
                reflectiveCurveToRelative(dx1 = -0.4f, dy1 = 0.9f, dx2 = -0.9f, dy2 = 0.9f)
            }
        }.build().also { _hederaHashgraph = it }
    }

@Suppress("ObjectPropertyName")
private var _hederaHashgraph: ImageVector? = null
